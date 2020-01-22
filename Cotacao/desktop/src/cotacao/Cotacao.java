/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotacao;

import conexao.Conexao;
import dao.AcaoDAO;
import jframe.JFrameInicio;
import modelo.Acao;


/**
 *
 * @author Kaustchr
 */
public class Cotacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexao.getConnection();
            
        Acao a = new Acao();
        /*a.setId(11);
        a.setNome("MRFG3");
        a.setEmpresa("MARFRIG");
        a.setValor(12.27);*/
        //AcaoDAO aDao = new AcaoDAO();
       // aDao.update(a);
        //aDao.listar();
        
        JFrameInicio jfi = new JFrameInicio();
        jfi.setVisible(true);
                
    }
    
}
