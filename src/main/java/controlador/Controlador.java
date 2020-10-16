/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Leidy Dayan Villamizar Martinez
 */

/**
 * Actionlistener se utiliza para que detecte el click del boton resolver de la vista
 * @author Hogar
 */
public class Controlador implements ActionListener{
    private Vista view;      
    private Modelo model;
    
    /**
     * constructor recibe dos parametros la vista y el modelo
     * @param view
     * @param model 
     */

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnPotencia.addActionListener(this); //accede a los controles de la vista
    }
    
    /**
     * inicia la vista
     */
    
    public void iniciar(){
     
        view.setTitle("Multiplicar");
        view.setLocationRelativeTo(null); //ventana inicia en la posicion cero
    }
    /**
     * 
     * @param e  recibe un evento 
     */
    
     public void actionPerformed(ActionEvent e){
     
        model.setNumeroUno(Integer.parseInt(view.txtNumUno.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumDos.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
}
