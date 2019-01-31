/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import Controlador.ctrControlador;
import Vista.Inicio;
import Vista.Loading;


/**
 *
 * @author Vanessa Estefania Corredor Andrade
 */
public class Agenda {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args)  throws ClassNotFoundException {
        //instanciando Loading
      Loading splash = new Loading();
      Inicio vtnInicio =new Inicio();
      //instaciando controlador
            ctrControlador ctr = new ctrControlador(splash,vtnInicio );
            ctr.inicio();

 
    }
    
}
