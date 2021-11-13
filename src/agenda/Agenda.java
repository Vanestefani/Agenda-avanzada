/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import Controlador.ctrControlador;
import Vista.Inicio;
import Vista.Loading;
import Vista.PanelAdministracion;
import Capsula.Capusuario;
import Modelo.mdlUsuario;

/**
 *
 * @author Vanessa Estefania Corredor Andrade
 */
public class Agenda {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
   public static void main(String[] args) throws ClassNotFoundException  {
        //instanciando Loading
      Loading splash = new Loading();
      Capusuario cu=new Capusuario();
      Inicio vtnInicio =new Inicio();
      mdlUsuario mu =new  mdlUsuario();
       PanelAdministracion padmin =new PanelAdministracion();
      //instaciando controlador
            ctrControlador ctr = new ctrControlador(splash,vtnInicio,cu ,mu);
            ctr.inicio();

 
    }
    
}
