/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Capsula.Capusuario;
import Vista.Loading;
import Vista.Inicio;
import Modelo.mdlUsuario;
import Vista.PanelAdministracion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import rojeru_san.RSPanelsSlider;

/**
 *
 * @author Vanessa Estefania Corredor Andrade
 */
public class ctrControlador implements ActionListener {//que escuche

    //Variables que guarda el tiempo 
    private Timer t;
    private int n = 0;
    //instanciando Loading
    private final Loading splash;
    private final Inicio vtnInicio;

    //Capsulas
    private final Capusuario usuario;//datos que voy acapturar
    //modelo
    private final mdlUsuario mdlUsuario; //BD

    //Contructor 
    public ctrControlador(Loading splash, Inicio vtnInicio,Capusuario usuario, mdlUsuario mdlUsuario) {
    this.mdlUsuario=mdlUsuario;
        this.usuario = usuario;
        this.splash = splash;
        this.vtnInicio = vtnInicio;
        // Boton para mostrar panel de registro
        this.vtnInicio.btnPnRegister.addActionListener(this);
        // Boton para mostrar panel de login
        this.vtnInicio.btnPnSesion.addActionListener(this);
        //Boton para registrar
        this.vtnInicio.BtnRegistrarUsuario.addActionListener(this);
        //Boton para iniciar sesion
        this.vtnInicio.BtnLogin.addActionListener(this);

   }

  

 

    //iniciar aplicacion
    public void inicio() {
        splash.setVisible(true);
        BarraProceso();
    }

    public void BarraProceso() {
        //metodo para la barra de progreso
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (n <= 100) {

                    splash.BarraProgreso.setValue(n);
                    splash.Porcentaje.setText(n + "%");
                    n = n + 10;
                } else {
                    t.stop();
                    splash.dispose();
                    vtnInicio.setVisible(true);
                }
            }
        };
        t = new Timer(100, accion);
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {//no borrar clase abstracta
    
        /// Boton para mostrar panel de registro
        if (e.getSource().equals(vtnInicio.btnPnRegister)) {
            if (!vtnInicio.btnPnRegister.isSelected()) {
                vtnInicio.btnPnRegister.setSelected(true);
                vtnInicio.btnPnSesion.setSelected(false);
                vtnInicio.PnSlider.nextPanel(20, vtnInicio.PnRegistro, vtnInicio.PnSlider.right);
            }
        }
        // Boton para mostrar panel de login
        if (e.getSource().equals(vtnInicio.btnPnSesion)) {
            if (!vtnInicio.btnPnSesion.isSelected()) {
                vtnInicio.btnPnSesion.setSelected(true);
                vtnInicio.btnPnRegister.setSelected(false);
                vtnInicio.PnSlider.nextPanel(20, vtnInicio.PnInisio, vtnInicio.PnSlider.left);
            }
        }
        // registro
        if (e.getSource().equals(vtnInicio.BtnRegistrarUsuario)) {
          String CofirmacioContraseña;
            usuario.setNombres(vtnInicio.txtNombres.getText());
            usuario.setApellidos(vtnInicio.txtApellidos.getText());
            usuario.setEmail(vtnInicio.txtEmail.getText());
            usuario.setContraseña(vtnInicio.txtContraseña.getText());
            CofirmacioContraseña=vtnInicio.txtComfirContraseña.getText();
           
     
                if (mdlUsuario.Registrarse(usuario)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                  
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                    
                }
        
            
            
        }

    }

}
