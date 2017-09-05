/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jordy-PC
 */
public class Consultas extends Conexion{
    
    public boolean autenticacion(String user, String pass) throws SQLException{
        
        Statement st = con.createStatement();
        ResultSet rs = null;
        String Consulta = "SELECT * FROM usuarios";
        
        rs = st.executeQuery(Consulta);
        
        while (rs.next()) {
            if (user.equals(rs.getString("usuario")) && pass.equals(rs.getString("contrasena"))) {
                return true;                
            }                        
        }
        return false;
    }
    
   
}
