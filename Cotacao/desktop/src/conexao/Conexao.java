/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Kaustchr
 */
public class Conexao {
    private static final String DRIVE = "com.mysql.jdbc.Driver";
    private static final String BANCO = "id10868208_contador";
    private static final String URL = "jdbc:mysql://remotemysql.com:3306/KQiUZIns5T" ;
//    private static final String URL = "jdbc:mysql://files.000webhost.com/id10868208_contador" ;
    private static final String USER = "KQiUZIns5T";
    private static final String PASS = "ooSFle1re3";
    
    public static Connection getConnection(){
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na Conexão - Não Conectado", ex);
        }
    }
    
    public static void closeConnection(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        } 
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        } 
        closeConnection(con);
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        } 
        closeConnection(con, stmt);
    }
}
