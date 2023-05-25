
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConnection(){
        
        try {
            Connection conn = DriverManager.getConnection( 
            "Jdbc:mysql://localhost:3306/parquebd",
            "root", 
            "" 
            );
            
            return conn;
        } catch (SQLException e) {
            System.out.println("Erro de conexão" + e.getMessage());
            return null;
        }
        }
    
}
