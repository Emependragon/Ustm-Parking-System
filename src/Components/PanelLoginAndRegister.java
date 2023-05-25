
package Components;

import Conexao.Login_con;
import Modelo.DAO.ModelLogin;
import Modelo.DAO.ModelUser;
import Principal.Principal;
import swing.components.Button; 
import swing.components.MyPasswordField;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import Utilitarios.Login;
import net.miginfocom.swing.MigLayout;
import swing.components.MyTextField;

public class PanelLoginAndRegister extends javax.swing.JLayeredPane {

   
    
    public ModelLogin getDataLogin() {
        return dataLogin;
    }
    
    public ModelUser getUser(){
        return user;
    }
    
    private ModelUser user;
    private ModelLogin dataLogin;

    public PanelLoginAndRegister() {
    }



    public PanelLoginAndRegister(ActionListener eventRegister, ActionListener eventLogin) {
        initComponents();
        initRegister(eventRegister);
        iniLogin(eventLogin);
       // login.setVisible(false);
       // register.setVisible(true);
    }
    
    private void initRegister(ActionListener eventRegister){
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Criar Conta");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(7, 164, 121));
        register.add(label);
        
        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/Img/user.png")));
        txtUser.setHint("Nome");
        register.add(txtUser, "w 60%");
        
        MyTextField txtEmail = new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/Img/mail.png")));
        txtEmail.setHint("Email");
        register.add(txtEmail, "w 60%");
        
        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/Img/pass.png")));
        txtPass.setHint("Password");
        register.add(txtPass, "w 60%");
        
        Button cmd = new Button();
        cmd.setBackground(new Color(7, 164, 121));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.addActionListener(eventRegister);
        cmd.setText("INSCREVER-SE");
        register.add(cmd, "w 40%, h 40");
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                    Login L1 = new Login();
                    Login_con lc = new Login_con();
                
                    L1.setNome(txtUser.getText());
                    L1.setEmail(txtEmail.getText());
                    L1.setPassword(txtPass.getText());
                    
                    if(L1.getNome().isEmpty() || L1.getEmail().isEmpty() || L1.getPassword().isEmpty()){
                        JOptionPane.showMessageDialog(PanelLoginAndRegister.this, "Por favor, preencha todos os campos.");
                        return;
                    }

                    boolean succces = lc.insert_login(L1);
                    
                    if (succces){
                        JOptionPane.showMessageDialog(PanelLoginAndRegister.this, "Dados inseridos com sucesso");
                    } else{
                        JOptionPane.showMessageDialog(PanelLoginAndRegister.this, "Falha");
                    }
                    
                    txtUser.setText("");
                    txtEmail.setText("");
                    txtPass.setText("");
                }
            
        });
    }
    
    private void iniLogin(ActionListener eventLogin){
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Entrar");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(7, 164, 121));
        login.add(label);
        
        //
        
        MyTextField txtEmail = new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/Img/mail.png")));
        txtEmail.setHint("Email");
        login.add(txtEmail, "w 60%");
        
        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/Img/pass.png")));
        txtPass.setHint("Password");
        login.add(txtPass, "w 60%");
        
        JButton cmdForget = new JButton("Esqueceu seu password?");
        cmdForget.setForeground(new Color(100,100,100));
        cmdForget.setFont(new Font("sansserif", 1, 12));
        cmdForget.setContentAreaFilled(false);
        cmdForget.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.add(cmdForget);
        
        Button cmd1 = new Button();
        cmd1.setBackground(new Color(7, 164, 121));
        cmd1.setForeground(new Color(250, 250, 250));
    
        cmd1.setText("ENTRAR");
        login.add(cmd1, "w 40%, h 40");
        
        cmd1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                try {
                    
                Login L1 = new Login();
                
                L1.setEmail(txtEmail.getText());
                L1.setPassword(txtPass.getText());
                
                Login_con lc = new Login_con();
                
                ResultSet rs_login = lc.aut_login(L1);
                
                if (rs_login.next()) {
                    
                    Principal t1 = new Principal();
                    t1.setVisible(true);
                    
                    
                    txtEmail.setText("");
                    txtPass.setText("");
                    
                    login.setVisible(false);
                    register.setVisible(false);
                            
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario ou Senha inválida");
                }
                
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Login"+ e);
                } 
                
                
            }
        });
    }
    
    public void showRegister(boolean show){
        if (show){
            register.setVisible(true);
            login.setVisible(false);
        } else{
            register.setVisible(false);
            login.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
