/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenumo;

import javax.swing.JOptionPane;

/**
 *
 * @author PRUEVA
 */
public class ExamenUmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno alumno = new Alumno();
        Profesor profesor = new Profesor();
        JOptionPane.showInternalMessageDialog(null, "ingresar datos del alumno");
        alumno.ingresar_datos();
        alumno.ingresarGrado();
        JOptionPane.showInternalMessageDialog(null, "ingresar datos del profesor");
        profesor.ingresar_datos();
        profesor.establecerMateria();
        
        if(profesor.mostrarNumeroAleatorio() < alumno.mostrarNumeroAleatorio()){
            System.out.println(alumno.toString());
            
        }if(profesor.mostrarNumeroAleatorio() > alumno.mostrarNumeroAleatorio()){
            System.out.println(profesor.toString());
            
        }if(profesor.mostrarNumeroAleatorio() == alumno.mostrarNumeroAleatorio()) {
            System.out.println(" a sido un empate");
        }          
    }
}
