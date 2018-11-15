/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        File hola = new File("hola.txt");
        FileReader fr;
        BufferedReader br;
        String cadena1, cadena2 = "";
        String dato[];
        try {
             fr = new FileReader(hola);
             br = new BufferedReader(fr);
              while ((cadena1 = br.readLine())!= null) {            
            cadena2+=cadena1;
        }
              dato= cadena2.split(" ");
              Arrays.sort(dato);
              for (int i = 0; i < dato.length; i++) {
                  System.out.println(dato[i]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     
       
        
    }
}
