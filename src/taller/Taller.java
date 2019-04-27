/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import taller.vista.Principal;
import javax.swing.JFrame;

/**
 *
 * @author Pe&Ge
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        Principal v = new Principal();
        v.setTitle("Taller de Reparación");
        v.setVisible(true);
        v.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
