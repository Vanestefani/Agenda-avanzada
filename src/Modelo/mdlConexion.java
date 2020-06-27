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

    private final String User = "root";
    private final String pass = "";
    private final String BD = "agenda_avanzada";
    private final String puerto = "3306";
    private final String url = "localhost";
    private final String driver = "jdbc:mysql://" + url + ":" + puerto + "/" + BD;
    private Connection con = null;
    public Connection getConexion() throws ClassNotFoundException, SQLException {
    try {
         Class.forName("com.mysql.jdbc.Driver");
    con= (Connection) DriverManager.getConnection(this.driver,this.User,this.pass);}catch (SQLException e) 
                            {
                                JOptionPane.showMessageDialog(null, "Error:" + e.getMessage(), "Error de Conexion",JOptionPane.ERROR_MESSAGE);
                            }
            
            
            
        return con;
          
    }

}