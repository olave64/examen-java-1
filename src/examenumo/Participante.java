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

public class Participante {
    private final int numeroAleatorio;
    private String nombre;
    private String apellido;
    private int edad;

     public Participante() {
        numeroAleatorio = (int)(Math.random()*6+1);
        nombre ="";
        apellido ="";
        edad = 0;
    }
    
    
    public double mostrarNumeroAleatorio(){
        return numeroAleatorio;
    }

   
    public void ingresar_datos(){
        boolean error = false;
        nombre=JOptionPane.showInputDialog("ingrese su nombre por favor");
        apellido=JOptionPane.showInputDialog("Ingrese su apellido");
        do{
            try{
            
            edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad por favor"));
            error=true;
        }
        catch(NumberFormatException e){
                
                System.out.println(e);
                JOptionPane.showInternalMessageDialog(null, "ingresa numeros no letras");
                      
        }
        }while(!error);
    
        
        
    }

    public String mostrar_datos(){
        return "nombre = "+ nombre+" apellido = "+apellido+" edad = "+edad;
    }

    
    
}
