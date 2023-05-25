
package Cadastro;

import Utilitarios.Conexao;
import Utilitarios.Data;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class novoCadastro extends javax.swing.JFrame {

    Conexao Con_contasareceber;
    Conexao Con_clientemensal;
    Conexao Con_preco;
    String datacadastro = "01/1/1111";
    String porte = "P";
    int comparacao;
    
    String Mess, Anoo, Diaa;
    int diarestant;
    float ValorDia = 0, VALORCONT = 0;
    
    

    public novoCadastro() {
        initComponents();
        Con_clientemensal = new Conexao();
        Con_clientemensal.conecta();
        //Con_clientemensal.executarSQL("select * from clientemen");
        
        Data mostra_data = new Data();
        mostra_data.le_data();
        datacadastro = (mostra_data.dia+ "/" + mostra_data.mes + "/" + mostra_data.ano);
        Diaa = mostra_data.dia;
        Mess = mostra_data.mes;
        Anoo = mostra_data.ano;
        
        
        Con_preco = new Conexao();
        Con_preco.conecta();
        Con_preco.executarSQL("select * from preco");
        
        Con_contasareceber = new Conexao();
        Con_contasareceber.conecta();
        Con_contasareceber.executarSQL("select * from contasareceber");
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        coDtxt = new javax.swing.JLabel();
        cod = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        rua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        uf = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        portg = new javax.swing.JRadioButton();
        portm = new javax.swing.JRadioButton();
        portp = new javax.swing.JRadioButton();
        cor = new javax.swing.JTextField();
        BotaoSalvar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Novo Cadastro");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Pessoais"));

        jLabel1.setText("Nome");

        jLabel2.setText("Telefone");

        jLabel3.setText("BI");

        rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgActionPerformed(evt);
            }
        });

        jLabel4.setText("CPF");

        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });

        coDtxt.setText("Cod");

        cod.setText("0000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(coDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(telefone))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coDtxt)
                    .addComponent(cod))
                .addGap(26, 26, 26))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel7.setText("Rua");

        jLabel8.setText("N°");

        jLabel9.setText("Cidade");

        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });

        jLabel10.setText("Estado");

        bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroActionPerformed(evt);
            }
        });

        jLabel13.setText("Bairro");

        uf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Maputo ", "Motola", "Xai-Xai", "Inhambane", "Beira", "Chimoio", "Tete", "Quelimane", "Nampula", "Lichinga", "Pemba" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Veículo"));

        jLabel11.setText("Placa");

        jLabel14.setText("Modelo");

        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });

        jLabel15.setText("Cor");

        jLabel12.setText("Porte: ");

        buttonGroup1.add(portg);
        portg.setText("Grande");
        portg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portgActionPerformed(evt);
            }
        });

        buttonGroup1.add(portm);
        portm.setText("Médio");
        portm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portmActionPerformed(evt);
            }
        });

        buttonGroup1.add(portp);
        portp.setText("Pequeno");
        portp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(modelo)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(portg, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(portm, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(portp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(portg)
                    .addComponent(portm)
                    .addComponent(portp))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cor)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addContainerGap())
        );

        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoExcluir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSalvar)
                    .addComponent(BotaoExcluir))
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

        setSize(new java.awt.Dimension(828, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgActionPerformed

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeActionPerformed

    private void bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroActionPerformed

    private void modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloActionPerformed

    private void portgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portgActionPerformed
        porte = "G";
    }//GEN-LAST:event_portgActionPerformed

    private void portmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portmActionPerformed
        porte = "M";
    }//GEN-LAST:event_portmActionPerformed

    private void portpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portpActionPerformed
        porte = "P";
    }//GEN-LAST:event_portpActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        if (comparacao == 1) {
            gravar();
            cadastrar.ExecutarMetodTelaProncip();
        } else {
            AlterarDadosCadastro();
            cadastrar.ExecutarMetodTelaProncip(); 
        }
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir");
        if(opcao == JOptionPane.YES_NO_OPTION){
            Excluir();
            cadastrar.ExecutarMetodTelaProncip();
        }
    }//GEN-LAST:event_BotaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(novoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(novoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(novoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(novoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new novoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JTextField bairro;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cidade;
    private javax.swing.JLabel coDtxt;
    private javax.swing.JLabel cod;
    private javax.swing.JTextField cor;
    private javax.swing.JTextField cpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField placa;
    private javax.swing.JRadioButton portg;
    private javax.swing.JRadioButton portm;
    private javax.swing.JRadioButton portp;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField rua;
    private javax.swing.JTextField telefone;
    private javax.swing.JComboBox<String> uf;
    // End of variables declaration//GEN-END:variables

    
    private Cadastro cadastrar;
    
    public void mostrar (Cadastro MostrarTelaCadastro){
        this.cadastrar = MostrarTelaCadastro;
        setVisible(true);
    }
    
public void gravar(){
    Con_clientemensal.executarSQL("select * from clientemen");
    
    try {
        String sql_insert = "insert into clientemen (nome,fone,rg,cpf,rua,numero,bairro,cidade,uf,placa,port,modelo,cor,datacadastro) values"
                + "('"
                + nome.getText()+ "','"
                + telefone.getText()+"','"
                + rg.getText() + "','"
                + cpf.getText() + "','" 
                + rua.getText() + "','" 
                + numero.getText() + "','" 
                +  bairro.getText()+ "','" 
                + cidade.getText() + "','"
                + uf.getSelectedItem()+ "','" 
                + placa.getText() + "','" 
                + porte + "','"
                + modelo.getText() + "','"
                + cor.getText()+ "','"
                + datacadastro + "')";
        
        if(nome.getText().isEmpty() || telefone.getText().isEmpty() || rg.getText().isEmpty() || cpf.getText().isEmpty() ||
                rua.getText().isEmpty() || numero.getText().isEmpty() || bairro.getText().isEmpty() || cidade.getText().isEmpty()
                || placa.getText().isEmpty() || modelo.getText().isEmpty() || cor.getText().isEmpty()
                ){
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos");
        } else{
        Con_clientemensal.statement.executeUpdate(sql_insert);
        //JOptionPane.showMessageDialog(null, "Gravação realizada");
        GravarContasaReceber();
        cadastrar.PreencherTabelaClienteMensal();
        }
               Limpa();
                
                Con_clientemensal.executarSQL("select * from clientemen");
                Con_clientemensal.resultSet.first();
                
    } catch (SQLException e) {
        
        JOptionPane.showMessageDialog(null, "Erro na gravação, Verifique se existe um cadastro com a mesma placa!" + e.getMessage());
    }
    
}

public void ExibirDadosClienteMensal(Cadastro LinhaPesquisa, int Linha, String Pesquisa){
    Con_clientemensal.executarSQL("select * from clientemen where nome like '%" +Pesquisa +"%' order by nome LIMIT " + Linha + " , 1");
    
    try {
        Con_clientemensal.resultSet.first();
        cod.setText(Con_clientemensal.resultSet.getString("cod"));
        nome.setText(Con_clientemensal.resultSet.getString("nome"));
        telefone.setText(Con_clientemensal.resultSet.getString("fone"));
        rg.setText(Con_clientemensal.resultSet.getString("rg"));
        cpf.setText(Con_clientemensal.resultSet.getString("cpf"));
        rua.setText(Con_clientemensal.resultSet.getString("rua"));
        numero.setText(Con_clientemensal.resultSet.getString("numero"));
        bairro.setText(Con_clientemensal.resultSet.getString("bairro"));
        cidade.setText(Con_clientemensal.resultSet.getString("cidade"));
        uf.setSelectedItem(Con_clientemensal.resultSet.getString("uf"));
        placa.setText(Con_clientemensal.resultSet.getString("placa"));
        modelo.setText(Con_clientemensal.resultSet.getString("modelo"));
        cor.setText(Con_clientemensal.resultSet.getString("cor"));
        
        switch (Con_clientemensal.resultSet.getString("port")) {
            case "G":
                portg.setSelected(true);
                break;
            case "M":
                portm.setSelected(true);
                break;
            default:
                portp.setSelected(true);
                break;
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro na glocalização dos dados " + e.getMessage());
    }
}

public void AlterarDadosCadastro(){
    try {
        String sql = "UPDATE clientemen SET "
                + "nome = '" + nome.getText() + "',"
                + "fone = '" + telefone.getText() + "',"
                + "rg = '" + rg.getText() + "',"
                + "cpf = '" + cpf.getText() + "',"
                + "rua = '" + rua.getText() + "',"
                + "numero = '" + numero.getText() + "',"
                + "bairro = '" + bairro.getText() + "',"
                + "cidade = '" + cidade.getText() + "',"
                + "uf = '" + uf.getSelectedItem()+ "',"
                + "placa = '" + placa.getText() + "',"
                + "port = '" + porte + "',"
                + "modelo = '" + modelo.getText() + "',"
                + "cor = '" + cor.getText() + "'"
                + "where cod = " + cod.getText();
    
        Con_clientemensal.statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Alteração feita com sucesso!");
        cadastrar.PreencherTabelaClienteMensal();
        Con_clientemensal.executarSQL("select * from clientemen");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro na alteração dos dados");
    }
}

public void Excluir(){
    
    try {
        String SQLdeleta = "DELETE FROM clientemen where cod = " + cod.getText();
        Con_clientemensal.statement.executeUpdate(SQLdeleta);
        JOptionPane.showMessageDialog(null, "Dados apagados");
        cadastrar.PreencherTabelaClienteMensal();
                Limpa();
                cod.setText("");
                Con_clientemensal.executarSQL("select * from clientemen");
                Con_clientemensal.resultSet.first(); 
                dispose();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao apagar os dados");
        
    }
}

public void CorrigeBotao(Cadastro cad, int corrige){
    if(corrige == 1){
        BotaoSalvar.setText("Salvar");
        BotaoExcluir.setVisible(false);
        comparacao = 1;
    }else{
        BotaoSalvar.setText("Salvar Alterações");
        BotaoExcluir.setVisible(true);
        comparacao = 0;
    }
}

public void CalculaValor(){
    int ano = Integer.parseInt((Anoo));
    int mes = Integer.parseInt((Mess));
    int dia = Integer.parseInt((Diaa));
    int M = 0;
    
    int ResultDivisao = ano % 4;
    
    if(ResultDivisao == 0){
        switch(mes){
            case 1: M = 31; diarestant = M - dia; break;
            case 2: M = 29; diarestant = M - dia; break;
            case 3: M = 31; diarestant = M - dia; break;
            case 4: M = 30; diarestant = M - dia; break;
            case 5: M = 31; diarestant = M - dia; break;
            case 6: M = 30; diarestant = M - dia; break;
            case 7: M = 31; diarestant = M - dia; break;
            case 8: M = 31; diarestant = M - dia; break;
            case 9: M = 30; diarestant = M - dia; break;
            case 10: M = 31; diarestant = M - dia; break;
            case 11: M = 30; diarestant = M - dia; break;
            case 12: M = 31; diarestant = M - dia; break;
        }
    } else {
        switch(mes){
            case 1: M = 31; diarestant = M - dia; break;
            case 2: M = 28; diarestant = M - dia; break;
            case 3: M = 31; diarestant = M - dia; break;
            case 4: M = 30; diarestant = M - dia; break;
            case 5: M = 31; diarestant = M - dia; break;
            case 6: M = 30; diarestant = M - dia; break;
            case 7: M = 31; diarestant = M - dia; break;
            case 8: M = 31; diarestant = M - dia; break;
            case 9: M = 30; diarestant = M - dia; break;
            case 10: M = 31; diarestant = M - dia; break;
            case 11: M = 30; diarestant = M - dia; break;
            case 12: M = 31; diarestant = M - dia; break;
        } try {
            Con_preco.resultSet.first();
            String MesVGrande = Con_preco.resultSet.getString("valormesvgrande");
            String MesVMedio = Con_preco.resultSet.getString("valormesvmedio");
            String MesVPequeno = Con_preco.resultSet.getString("valormesvpequeno");
            
            float mg = Float.parseFloat(MesVGrande);
            float mm = Float.parseFloat(MesVMedio);
            float mp = Float.parseFloat(MesVPequeno);
            
            if(porte == "G"){
                ValorDia = mg / M;
            }
            if(porte == "M"){
                ValorDia = mm / M;
            }
            if(porte == "P"){
                ValorDia = mp / M;
            }
            VALORCONT = diarestant * ValorDia;
            //JOptionPane.showMessageDialog(null, VALORCONT);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular" + e.getMessage());
        }
    }
}

public void GravarContasaReceber(){
    CalculaValor();
    
    try {
        String SQLInsert = "insert into contasareceber (cliente,placa,"
                + "mes,ano,porte,valor,modelo,status) values ('"
                + nome.getText() +"','"
                + placa.getText() +"','"
                + Mess +"','"
                + Anoo +"','"
                + porte +"','"
                + VALORCONT +"','"
                + modelo.getText()+ "','" +
                "PENDENTE"+ "')";
        
        Con_contasareceber.statement.executeUpdate(SQLInsert);
        JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");

         Con_contasareceber.executarSQL("select * from contasareceber");
         Con_contasareceber.resultSet.first();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro na Gravação!" + e.getMessage());

    }
}

public void Limpa(){
    nome.setText("");
    telefone.setText("");
    rg.setText("");
    cpf.setText("");
    rua.setText("");
    numero.setText("");
    bairro.setText("");
    cidade.setText("");
    placa.setText("");
    modelo.setText("");
    cor.setText("");
    cod.setText("");
    portp.setSelected(true);
    porte = "P";
}

}
