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
public class Alumno extends Participante {

    private int grado =12;
    private String modulo = "Z";
    private String curso;
    
 public void ingresarGrado(){
     boolean error = false;
       do{
           try{
               while(grado>11 || grado<1){
           grado = Integer.parseInt(JOptionPane.showInputDialog("Escoja el curso cursado entre 1-11"));
           
       }
           error=true;
           }catch(NumberFormatException e){
               System.out.println(e);
           }
           
       }while(!error);
       
       //no nesecito manejar exception
       while(! modulo.equalsIgnoreCase("A") && !modulo.equalsIgnoreCase("B") && !modulo.equalsIgnoreCase("C")&& !modulo.equalsIgnoreCase("D")){
           modulo= JOptionPane.showInputDialog("Escoja el grado de la letra A la D");
       }
       
  curso = grado+"°"+modulo;

 }
 

    @Override
    public String toString() {
        return "Alumno{"+ super.mostrar_datos() + "curso =" + curso + "numero = "+""+ super.mostrarNumeroAleatorio()+ '}';
    }
 

}

    