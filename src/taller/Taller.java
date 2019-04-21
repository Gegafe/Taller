/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.time.LocalDate;
import java.util.List;
import taller.modelo.*;


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
        Conexion co = new Conexion();
                
        AparatoData ad = new AparatoData(co);
        List<Aparato> a = ad.obtenerAparatosXDuenio(2);
        
        for (Aparato aparato : a) {
            System.out.println("Aparato id: "+ aparato.getIdAparato());
            System.out.println(aparato.getDuenio().getNombre());
            System.out.println(aparato.getNroSerie());
            System.out.println("--------------------------- ");
        }
        
    }
    
}
