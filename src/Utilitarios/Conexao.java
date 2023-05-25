
package Utilitarios;


import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Denilson Tec
 */
public class Conexao {
    
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url  = "jdbc:mysql://localhost:3306/estacionamento";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultSet;
    
    
    public boolean conecta() {
        boolean result = true;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexao Feita");

        } catch (ClassNotFoundException Fonte) {
            JOptionPane.showMessageDialog(null, "Driver não localizado");
            result  = false; 
        } catch(SQLException Fonte){
            JOptionPane.showMessageDialog(null, "Erro na conexão");
            result = false;
        }
        return result;
    }
    
    public void desconecta(){
        boolean result = true;
        
        try {
            conexao.close();
             JOptionPane.showMessageDialog(null, "Conexão fechada");
        } catch (SQLException fech) {
            
             JOptionPane.showMessageDialog(null, "Erro aa fechar a conexão");
             result = false;
        }
    }
    
    public void executarSQL(String sql){
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(sql);
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar o comando sql"+sqlex+"O comando passado foi"+sql);
        }
    }
}
    
    

