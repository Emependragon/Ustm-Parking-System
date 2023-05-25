
package Cadastro;

import Principal.Principal;
import Utilitarios.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cadastro extends javax.swing.JFrame {
    
    novoCadastro  Telanovocadastro  = new novoCadastro();
 
    Conexao Con_clientemensal;
    int verificacao = 1;
    
    public Cadastro() {
        initComponents();
        Con_clientemensal = new Conexao();
        Con_clientemensal.conecta();
        Con_clientemensal.executarSQL("select * from clientemen");
        PreencherTabelaClienteMensal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CampoPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaClienteMensal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Cadastro");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Novo Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar Cliente");

        CampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoPesquisaKeyReleased(evt);
            }
        });

        TabelaClienteMensal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Telefone", "Placa do Veículo", "Data de Cadastro"
            }
        ));
        TabelaClienteMensal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClienteMensalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaClienteMensal);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(900, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Telanovocadastro.mostrar(this);
        verificacao = 1;
        Telanovocadastro.CorrigeBotao(this, verificacao);
        Telanovocadastro.Limpa();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CampoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoPesquisaKeyReleased
        PreencherTabelaClienteMensal();
    }//GEN-LAST:event_CampoPesquisaKeyReleased

    private void TabelaClienteMensalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClienteMensalMouseClicked
        int LinhaCadastro = TabelaClienteMensal.getSelectedRow();
        String CampoPesquisaMens  = String.valueOf(CampoPesquisa.getText());
        Telanovocadastro.mostrar(this);
        Telanovocadastro.ExibirDadosClienteMensal(this, LinhaCadastro, CampoPesquisaMens);
        
        verificacao = 0;
        Telanovocadastro.CorrigeBotao(this, verificacao);

    }//GEN-LAST:event_TabelaClienteMensalMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoPesquisa;
    private javax.swing.JTable TabelaClienteMensal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void PreencherTabelaClienteMensal(){
        Con_clientemensal.executarSQL("select * from clientemen where nome like '%" +CampoPesquisa.getText() +"%'");
        
        TabelaClienteMensal.getColumnModel().getColumn(0).setPreferredWidth(400);
        TabelaClienteMensal.getColumnModel().getColumn(1).setPreferredWidth(200);
        TabelaClienteMensal.getColumnModel().getColumn(2).setPreferredWidth(200);
        TabelaClienteMensal.getColumnModel().getColumn(3).setPreferredWidth(200);
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaClienteMensal.getModel();
        modelo.setNumRows(0);
        
        try {
            while(Con_clientemensal.resultSet.next()){
                
                modelo.addRow(new Object[]{
                    Con_clientemensal.resultSet.getString("nome"),
                    Con_clientemensal.resultSet.getString("fone"),
                    Con_clientemensal.resultSet.getString("placa"),
                    Con_clientemensal.resultSet.getString("datacadastro")
                });
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tebela");
        }
    }
    
    private Principal TelaPrin;
    public void mostrar (Principal MostrarTelaPrincipal){
        this.TelaPrin = MostrarTelaPrincipal;
        setVisible(true);
    }
    
    public void ExecutarMetodTelaProncip(){
        TelaPrin.PreencherTabelaContasAReceber();
        TelaPrin.ContaVagas();
    }

}
