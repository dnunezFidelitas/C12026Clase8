/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasovectoresymartrices;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class RepasoVectoresYMartrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fernando fernando = new Fernando(3);
        JOptionPane.showMessageDialog(null, fernando.toString());
        Fernando fernandoFuturo = new Fernando(9);
        JOptionPane.showMessageDialog(null, fernandoFuturo.toString());
    }
    
}
