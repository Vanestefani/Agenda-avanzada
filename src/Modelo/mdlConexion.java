/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vanessa
 */
public class mdlConexion {

    
// Atributos de la clase

    private final String user = "root";
    private final String pass = "";
    private final String base = "agenda_avanzada";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;
    
    public Connection getConexion() throws ClassNotFoundException{
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
        } catch(SQLException e){
            System.err.println(e);
        } 
        
        return con;
    }

}