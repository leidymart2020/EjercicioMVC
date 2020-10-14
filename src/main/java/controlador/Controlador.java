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
 * @author Hogar
 */
public class Controlador implements ActionListener{
    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnPotencia.addActionListener(this);
    }
    
    public void iniciar(){
     
        view.setTitle("Elevar un numero");
        view.setLocationRelativeTo(null);
    }
    
     public void actionPerformed(ActionEvent e){
     
        model.setNumeroUno(Integer.parseInt(view.txtNumUno.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumDos.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
}
