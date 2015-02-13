/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package analizador;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * @author Taty
 */
public class Ejecutar {
     public static void main(String[] args) throws FileNotFoundException, Exception {
        // TODO code application logic here
        
      
     
      String numero="";
         Scanner entrada=new Scanner(System.in);
         System.out.println("Ingrese la sentencia");
         numero=entrada.next();
         FileOutputStream f=new FileOutputStream("E:\\Flash de 8 taty\\COMPILADORCELULAR\\AnalizadorLexicoJFLEXCelular\\src\\analizador\\entrada.txt");
         BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(f));
         bw.write(numero);
         bw.close();
         AnalizadorSintactico as= new AnalizadorSintactico(new Analizador(new InputStreamReader(new FileInputStream("E:\\Flash de 8 taty\\COMPILADORCELULAR\\AnalizadorLexicoJFLEXCelular\\src\\analizador\\entrada.txt"))));
         
             as.parse();
             
             
         
    }
    
    
    
}
