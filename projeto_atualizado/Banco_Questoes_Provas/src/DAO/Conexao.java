
package DAO;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    public static Connection AbrirConexao(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/banco_questoes";
            con = DriverManager.getConnection(url, "root", "eeep");
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error:"+e.getMessage());
        
        }
        
        return con; 
    }
}

