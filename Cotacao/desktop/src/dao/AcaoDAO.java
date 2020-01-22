/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.annotations.Ignore;
import modelo.Acao;
import modelo.Historico;

/**
 *
 * @author Kaustchr
 */
public class AcaoDAO {
    private Connection con = null;

    public AcaoDAO() {
        con = Conexao.getConnection();
    }
   
    public boolean insert(Acao acao, Historico hist){
        String sql="INSERT INTO acao (nome, empresa, valor) VALUES (?, ?, ?)"; 
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, acao.getNome());
            stmt.setString(2, acao.getEmpresa());
            stmt.setDouble(3, acao.getValor());
            stmt.executeUpdate();
            HistoricoDao hDao = new HistoricoDao();
            hDao.insert(hist);
            JOptionPane.showMessageDialog(null, "INSERIDO");
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            JOptionPane.showMessageDialog(null, "NÃO INSERIDO");
            return false;
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }
    
    public boolean update(Acao acao){
        String sql="UPDATE acao SET nome = ?, empresa = ? WHERE id = ?"; 
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, acao.getNome());
            stmt.setString(2, acao.getEmpresa());
            stmt.setInt(3, acao.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }
    
    public boolean updateHistorico(Acao acao){
        String sql="UPDATE acao SET valor = ? WHERE id = ?"; 
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setDouble(1, acao.getValor());
            stmt.setInt(2, acao.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }
    
    public boolean delete(Acao acao){
        String sql="DELETE FROM acao WHERE id = ?"; 
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, acao.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }
    
    public void findID(Acao acao){
        String sql = "SELECT * FROM acao WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
           stmt = con.prepareStatement(sql);
            stmt.setInt(1, acao.getId());
            rs = stmt.executeQuery();
           while(rs.next()){
               acao.setId(rs.getInt("id"));
               acao.setNome(rs.getString("nome"));
               acao.setEmpresa(rs.getString("empresa"));
               acao.setValor(rs.getDouble("valor"));
           }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
    }
    
    public String findAllERROR(){
        String sql = "SELECT * FROM acao";
        String lista = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Acao> acoes = new ArrayList<>();
        try {
           stmt = con.prepareStatement(sql);
           rs = stmt.executeQuery();
           lista = "ID ---- CODIGO --- EMPRESA --- PREÇO \n";
           while(rs.next()){
               Acao acao = new Acao();
               acao.setId(rs.getInt("id"));
               acao.setNome(rs.getString("nome"));
               acao.setEmpresa(rs.getString("empresa"));
               acao.setValor(rs.getDouble("valor"));
               //acoes.add(acao);
               lista +=  rs.getInt("id") + " - " + rs.getString("nome") + " - "
                    + rs.getString("empresa") + " - " +  rs.getDouble("valor") + "\n";
           }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
    public List<Acao> findAll(){
        String sql = "SELECT * FROM acao";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Acao> acoes = new ArrayList<>();
        try {
           stmt = con.prepareStatement(sql);
           rs = stmt.executeQuery();
           while(rs.next()){
               Acao acao = new Acao();
               acao.setId(rs.getInt("id"));
               acao.setNome(rs.getString("nome"));
               acao.setEmpresa(rs.getString("empresa"));
               acao.setValor(rs.getDouble("valor"));
               acoes.add(acao);
           }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        return acoes;
    }
    
    public int selectLastID(){
        int lastId = 0;
        String sql="SELECT id FROM acao ORDER BY id DESC limit 1"; 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                lastId = rs.getInt("id");
            }
            return lastId;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return 0;
        }finally{
           // Conexao.closeConnection(con, stmt, rs);
        }
    }
    
   
    
    @Ignore
    public void listar(){
        AcaoDAO dao = new AcaoDAO();
        for(Acao a : dao.findAll()){
            System.out.println("AÇÃO: " + a.getNome());
        }
    }
}
