
package jframe;
import dao.AcaoDAO;
import dao.HistoricoDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Acao;
import modelo.Historico;

/**
 *
 * @author Kaustchr
 */
public class JFrameInicio extends javax.swing.JFrame {
    Date data = new Date();
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    /**
     * Creates new form JFrameInicio
     */
    public JFrameInicio() {
        initComponents();
        lista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTIdAcao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTCodigoAcao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTEmpresaAcao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTValorAcao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAcoes = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTHistorico = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTIdAcao.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTIdAcao.setMinimumSize(new java.awt.Dimension(15, 30));
        jTIdAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdAcaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("ID");

        jTCodigoAcao.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTCodigoAcao.setMinimumSize(new java.awt.Dimension(15, 30));
        jTCodigoAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoAcaoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("CODIGO");

        jTEmpresaAcao.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTEmpresaAcao.setMinimumSize(new java.awt.Dimension(15, 30));
        jTEmpresaAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEmpresaAcaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("EMPRESA");

        jTValorAcao.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTValorAcao.setMinimumSize(new java.awt.Dimension(15, 30));
        jTValorAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTValorAcaoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("VALOR");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel5.setText("AÇÔES");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("INSERIR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("ALTERAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("EXCLUIR");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("ATLZR HISTORICO");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("CONSULTAR");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jTAcoes.setColumns(20);
        jTAcoes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTAcoes.setRows(5);
        jScrollPane1.setViewportView(jTAcoes);

        jTHistorico.setColumns(20);
        jTHistorico.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTHistorico.setRows(5);
        jScrollPane2.setViewportView(jTHistorico);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("HISTÓRICO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTIdAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTCodigoAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTEmpresaAcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTValorAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(251, 251, 251))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTValorAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTEmpresaAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTCodigoAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTIdAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTIdAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdAcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdAcaoActionPerformed

    private void jTCodigoAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoAcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoAcaoActionPerformed

    private void jTEmpresaAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEmpresaAcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTEmpresaAcaoActionPerformed

    private void jTValorAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTValorAcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTValorAcaoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // INSERT
        if(!jTCodigoAcao.getText().equals("") && !jTEmpresaAcao.getText().equals("") && !jTValorAcao.getText().equals("")){
            Acao a = new Acao();
            AcaoDAO aDao = new AcaoDAO();
            a.setNome(jTCodigoAcao.getText());
            a.setEmpresa(jTEmpresaAcao.getText());
            a.setValor(Double.parseDouble(jTValorAcao.getText()));
            Historico h = new Historico();
            h.setId_acao(1 + aDao.selectLastID());
            h.setData(formatador.format(data));
            h.setValor(a.getValor());
            aDao.insert(a,h);
            lista();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // UPDATE
        if(!jTIdAcao.getText().equals("") && !jTCodigoAcao.getText().equals("") && !jTEmpresaAcao.getText().equals("")){
            Acao a = new Acao();
            a.setId(Integer.parseInt(jTIdAcao.getText()));
            a.setNome(jTCodigoAcao.getText());
            a.setEmpresa(jTEmpresaAcao.getText());
            //a.setValor(Double.parseDouble(jTValorAcao.getText()));
            AcaoDAO aDao = new AcaoDAO();
            aDao.update(a);
            lista();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // DELETE
        if(!jTIdAcao.getText().equals("")){
            AcaoDAO aDao = new AcaoDAO();
            Acao a = new Acao();
            a.setId(Integer.parseInt(jTIdAcao.getText()));
            aDao.delete(a);
            lista();
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // UPDATE HISTORICO
        if(!jTIdAcao.getText().equals("") && !jTValorAcao.getText().equals("")){
                Historico h = new Historico();
                h.setId_acao(Integer.parseInt(jTIdAcao.getText()));
                h.setValor(Double.parseDouble(jTValorAcao.getText()));
                h.setData(formatador.format(data));
                Acao a = new Acao();
                a.setId(Integer.parseInt(jTIdAcao.getText()));
                a.setValor(Double.parseDouble(jTValorAcao.getText()));
                HistoricoDao hDao=  new HistoricoDao();
                hDao.insert(h);
                AcaoDAO aDao = new AcaoDAO();
                aDao.updateHistorico(a);
                lista();
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // SEARCH AÇÂO
        if(!jTIdAcao.getText().equals("")){
            AcaoDAO aDao = new AcaoDAO();
            Acao a = new Acao();
            a.setId(Integer.parseInt(jTIdAcao.getText()));
            aDao.findID(a);
            jTCodigoAcao.setText(a.getNome());
            jTEmpresaAcao.setText(a.getEmpresa());
            jTValorAcao.setText(a.getValor()+ "");
            lista();
        }
    }//GEN-LAST:event_jButton5MouseClicked

    public void lista(){
        AcaoDAO aDao = new AcaoDAO();
        jTAcoes.setText(aDao.findAllERROR());
        HistoricoDao hDao = new HistoricoDao();
        jTHistorico.setText(hDao.findAllERROR());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameInicio().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAcoes;
    private javax.swing.JTextField jTCodigoAcao;
    private javax.swing.JTextField jTEmpresaAcao;
    private javax.swing.JTextArea jTHistorico;
    private javax.swing.JTextField jTIdAcao;
    private javax.swing.JTextField jTValorAcao;
    // End of variables declaration//GEN-END:variables
}
