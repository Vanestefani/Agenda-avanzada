/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Loading;
import Vista.Inicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author Vanessa Estefania Corredor Andrade
 */
public class ctrControlador implements ActionListener {
    //Variables que guarda el tiempo 

    private Timer t;
    private int n = 0;
    //instanciando Loading
    private final Loading splash;
    private final Inicio vtnInicio;
    //Contructor 

    public ctrControlador(Loading splash, Inicio vtnInicio) {
        this.splash = splash;
        this.vtnInicio = vtnInicio;
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
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
