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
 * @author Hogar
 */
public class Aplicacion {
    
    /**
     *
     * @param args
     */
    public static void main (String[] args){
       
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        
        Controlador controlador = new Controlador(vista,modelo);
        controlador.iniciar();
        vista.setVisible(true);
        
        
    }
}
