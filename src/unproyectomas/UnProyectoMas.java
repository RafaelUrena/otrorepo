/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unproyectomas;

/**
 *
 * @author daw206
 */
public class UnProyectoMas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n  = 0;
        Ayuda help = new Ayuda("Urgente","Quiero volver a casa");
        
        for (int i = 0; i < 11; i++) {
            n = i;
        }
        
        if(n >= 10 ){
            System.out.println("Hola");
            System.out.println(help);
        }
    }
    
}
