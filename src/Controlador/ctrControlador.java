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
    //Contructor 

    public ctrControlador(Loading splash, Inicio vtnInicio) {
        this.splash = splash;
        this.vtnInicio = vtnInicio;
        this.vtnInicio.btnPnRegister.addActionListener(this);
        this.vtnInicio.btnPnSesion.addActionListener(this);

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
    public void actionPerformed(ActionEvent e) {//no borar clase abstracta
        if (e.getSource().equals(vtnInicio.btnPnRegister)) {
            vtnInicio.PnSlider.nextPanel(5, vtnInicio.PnRegistro, vtnInicio.PnSlider.right);
            vtnInicio.PnSlider.refresh();
        }
        if (e.getSource().equals(vtnInicio.btnPnSesion)) {
            vtnInicio.PnSlider.nextPanel(5, vtnInicio.PnInisio, vtnInicio.PnSlider.left);
            vtnInicio.PnSlider.refresh();
        }

    }

}
