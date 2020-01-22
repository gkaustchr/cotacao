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
import modelo.Acao;
import modelo.Historico;

/**
 *
 * @author Kaustchr
 */
public class HistoricoDao {
    private Connection con = null;

    public HistoricoDao() {
        con = Conexao.getConnection();
    }
    
    public boolean insert(Historico hist){
        double val = 0;
        String sql="INSERT INTO historico (id_acao, data, valor, caiu) VALUES (?, ?, ?, ?)"; 
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, hist.getId_acao());
            stmt.setString(2, hist.getData());
            stmt.setDouble(3, hist.getValor());
            val = hist.getValor();
            if(selectLimit1(hist)){ // 0 = subiu , 1 = caiu
                if(val > hist.getValor())
                    hist.setCaiu(0);
                else
                    hist.setCaiu(1);
            }else{
                hist.setCaiu(0);
            }
            stmt.setInt(4, hist.getCaiu());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }finally{
            //Conexao.closeConnection(con, stmt);
        }
    }
    
    public boolean selectLimit1(Historico hist){
        String sql="SELECT * FROM historico WHERE id_acao = ? ORDER BY id DESC limit 1"; 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, hist.getId_acao());
            stmt.executeUpdate();
            rs = stmt.executeQuery();
            while(rs.next()) {
                hist.setId(rs.getInt("id"));
                hist.setId_acao(rs.getInt("id_acao"));
                hist.setData(rs.getString("data"));
                hist.setValor(rs.getDouble("valor"));
                hist.setCaiu(rs.getInt("caiu"));
            }
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }finally{
            //Conexao.closeConnection(con, stmt, rs);
        }
    }
    
    public String findAllERROR(){
        String sql = "SELECT * FROM historico ORDER BY id DESC";
        String lista = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Acao> acoes = new ArrayList<>();
        try {
           stmt = con.prepareStatement(sql);
           rs = stmt.executeQuery();
           lista = "ID ---- AÇÃO --- DATA --- PREÇO --- CAIU(1)/SUBIU(0)\n";
           while(rs.next()){
               Historico hist = new Historico();
               hist.setId(rs.getInt("id"));
               hist.setId_acao(rs.getInt("id_acao"));
               hist.setData(rs.getString("data"));
               hist.setValor(rs.getDouble("valor"));
               hist.setCaiu(rs.getInt("caiu"));
               //acoes.add(acao);
               lista +=  rs.getInt("id") + " - " + rs.getInt("id_acao") + " - "
                    + rs.getString("data") + " - " +  rs.getDouble("valor")
                       + " - " + rs.getInt("caiu") + "\n";
           }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
}
