/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package analizador;

import java.io.File;

/**
 *
 * @author Taty
 */
public class Ejecutorcup {
    
     public static void main(String[] args) {
        String opciones[] = new String[5];
        opciones[0]="-destdir";
        opciones[1]="src\\analizador";
        opciones[2]="-parser"; 
        opciones[3]="AnalizadorSintactico";
        opciones[4]="src\\analizador\\sintactico.cup";
       
        try {
            java_cup.Main.main(opciones);
            }
        catch (Exception e) {
            System.out.print(e);
            }
    }
    

    
}
