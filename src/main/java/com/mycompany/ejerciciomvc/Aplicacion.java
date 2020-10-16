/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciomvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Leidy Dayan Villamizar Martinez
 */
public class Aplicacion {
    
    /**
     *
     * @param args = Clae principal
     */
    public static void main (String[] args){
       
        /**
         * Creacion de objetos de las clases Vista y Modelo
         */
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        
        /**
         * Creacion del objeto Controlador y devuelve la Vista y el Modelo
         * inicia el metodo iniciar 
         * y la vista para que muestre la informacion
         */
        
        Controlador controlador = new Controlador(vista,modelo);
        controlador.iniciar();
        vista.setVisible(true);
        
        
    }
}
