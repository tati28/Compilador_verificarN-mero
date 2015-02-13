/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador;

import java.io.File;
import java.io.StringReader;

/**
 *
 * @author Taty
 */
public class ejecutor {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        String path="E:\\Flash de 8 taty\\COMPILADORCELULAR\\AnalizadorLexicoJFLEXCelular\\src\\analizador\\lexico.flex";
        generarLexer(path);
   

       
        // TODO code application logic here
    }
    
    public static void generarLexer(String path){
        File file= new File(path);
        JFlex.Main.generate(file);
    }
    
    public String validaCadena(String cadena) {
        String salida = "";
        try {
            analizador.Analizador analizador = new analizador.Analizador(new StringReader(cadena));
            salida=analizador.yytext();
        
        } catch (Exception ex) {
            System.out.println("ERROR");
        }
        return salida;
    }
}
