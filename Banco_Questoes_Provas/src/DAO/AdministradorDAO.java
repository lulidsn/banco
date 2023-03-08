
package DAO;

import Modelo.Administrador;
import Modelo.Professor;
import java.sql.*;
import javax.swing.JOptionPane;


public class AdministradorDAO extends ExecuteSQL{
    public AdministradorDAO (Connection con){
        super(con);
        }
    
         public void cadastrar_Professor(Professor p){
        String sql="insert into professor values(0,?,0,?,?)";
        try{
            PreparedStatement ps=getCon().prepareStatement(sql);
           ps.setInt(1, p.getCod());
           ps.setString(2, p.getNome());
           ps.setString(3, p.getLogin());
           ps.setString(5, p.getSenha());
           ps.setInt(5, p.getCod_adm());
           
           if(ps.executeUpdate()>0){
                  JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
                  
                  }else{
                  JOptionPane.showMessageDialog(null, "Não foi salvo");
              }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error:"+ e.getMessage());
                }  
        }
    
}
