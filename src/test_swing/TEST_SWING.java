/*
Ejercicio:
Crea un formulario con 3 botones / de título Ejercicio 2. 
Uno con texto Amarillo, 
otro con texto Azul
un tercero con el texto Aleatorio. 

Si se pulsa el amarillo o el azul 
el color de fondo del formulario cambiará a dicho color (averigua cómo se hace). 

Si pulsa el botón Aleatorio 
cambiará la posición del formulario en la pantalla dentro de un área de 600x400 aproximadamente.
 */
package test_swing;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author vane
 */
public class TEST_SWING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Frame
        JFrame princ= new JFrame("This IS test."); 
        princ.setSize(200, 400);
        princ.setVisible(true);
        princ.setLayout(new FlowLayout());
        
        //Botón1
        JButton ama=new JButton("ES AMALILLO");
        ama.setForeground(Color.yellow);
        princ.add(ama);
        
        //Botón2
        JButton azuuul=new JButton("ES AZUUUUL");
        azuuul.setForeground(Color.blue);
        princ.add(azuuul);
        
        //Botón3
        JButton randomm=new JButton("FUCKU");
        princ.add(randomm);
          
        JOptionPane.showMessageDialog(null, "aaaaaaaa","bbbbbbbbb",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showConfirmDialog(null, "ccccccc");
        JOptionPane.showConfirmDialog(ama, ":-C", "kkkkkkkkkkkk", 0, 0);
        
    
    }
    
}