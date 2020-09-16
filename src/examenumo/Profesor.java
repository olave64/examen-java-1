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
public class Profesor extends Participante{

    private String materia;

    public Profesor() {
       materia = null;
    }
    public void establecerMateria(){
        materia = JOptionPane.showInputDialog("Digite la materia por favor");
    }
    

    @Override
    public String toString() {
        return "Profesor{" + super.mostrar_datos() + " materia = " + materia +" "+ super.mostrarNumeroAleatorio()+ '}';
    }

    
}
