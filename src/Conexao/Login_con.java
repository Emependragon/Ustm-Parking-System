
package Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Utilitarios.Login;


public class Login_con {
    
    Connection c2;
    
    public ResultSet aut_login (Login c1){
        c2 = new Conexao().getConnection();
        try {
            String sql = "SELECT * FROM login WHERE email = ? AND password =?";
            PreparedStatement pstm = c2.prepareStatement(sql);
            pstm.setString(1, c1.getEmail());
            pstm.setString(2, c1.getPassword());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
            
            return null;
        }
    }
    
    public boolean insert_login (Login i1){
        c2 = new Conexao().getConnection();
        
        try {
            String sql = "INSERT INTO login (nome, email, password) VALUES (?, ?, ?)";
            PreparedStatement pstm = c2.prepareStatement(sql);
            
            pstm.setString(1, i1.getNome());
            pstm.setString(2, i1.getEmail());
            pstm.setString(3, i1.getPassword());
            
            int rowsAffected = pstm.executeUpdate();
            
            return rowsAffected > 0;
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro" + e);
            
            return false;
        }
        
    }
    
}
