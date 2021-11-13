/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Capsula.Capusuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.mdlConexion;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author vanes
 */
public class mdlUsuario  extends mdlConexion{
       public boolean Registrarse (Capusuario usr)  {
     PreparedStatement ps = null;
        Connection con = null 
                ;
           try {
               con = getConexion();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(mdlUsuario.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        
        String sql = "INSERT INTO usuario (email,contraseña, nombres, apellidos) VALUES (?,?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getEmail());
            ps.setString(2, usr.getContraseña());
            ps.setString(3, usr.getNombres());
            ps.setString(4, usr.getApellidos());
           
            ps.execute();
            return true;
            
        } catch(SQLException e){
            System.err.println(e);
            return false;
            
        } finally{
            try{
                con.close();
                
            } catch(SQLException e){
                System.err.println(e);
                
            }
        }
    }

}
    

