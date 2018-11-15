/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AlgorithmProject {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        String almacenamiento = "";
        String linea1 = "";
        String linea2 = "";
        String linea3 = "";
        String linea4 = "";
        String linea5 = "";
        String linea6 = "";
        String comandos[] = new String[6];
        comandos[0] = "create “ans.txt” as file_out";
        comandos[1] = "create “tmp.txt” as tmp";
        comandos[2] = "assign “test.txt” to file_in";
        comandos[3] = "tmp = sort file_in asc";
        comandos[4] = "tmp = rem_doubles tmp";
        comandos[5] = "file_out = tmp";
        int numlineas = 6;
        String datos[] = new String[numlineas];
        int contador = 0;

        File var_id1;
        File var_id2;
        File var_id3;
        File comandosar;
        String co[];
        int gg = 0;
        int cont = 0;

        try {
            comandosar = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\comandos.txt");
            FileReader LA1 = new FileReader(comandosar);
            BufferedReader BRCO = new BufferedReader(LA1);

            almacenamiento = BRCO.readLine();
//            while ((almacenamiento = BRCO.readLine()) != null) {
//                cont++;
//                for (int i = 0; i < comandos.length; i++) {
//                    if (!(almacenamiento.equals(comandos[i]))) {
//                        System.out.println("La linea " + cont + " està mal escrita");
//
//                    } else {
//                        System.out.println("El comando " + almacenamiento + " està bien escrita");
//
//                    }
//                }
//            }
            while (almacenamiento != null && contador < numlineas) {
                datos[contador] = almacenamiento;
                almacenamiento = BRCO.readLine();
                contador++;
            }
            
            BRCO.close();

            linea1 = datos[0];
            linea2 = datos[1];
            linea3 = datos[2];
            linea4 = datos[3];
            linea5 = datos[4];
            linea6 = datos[5];

                for(int i=0; i<comandos.length; i++){
                    if(linea1.equals(comandos[i])){
                        System.out.println("Línea 1 coincide con "+comandos[i]+" la posición del arreglo fue "+i);
                    }else if(linea2.equals(comandos[i])){
                        System.out.println("Línea 2 coincide con "+comandos[i]+" la posición del arreglo fue "+i);
                    }else if(linea3.equals(comandos[i])){
                        System.out.println("Línea 3 coincide con "+comandos[i]+" la posición del arreglo fue "+i);
                    }else if(linea4.equals(comandos[i])){
                        System.out.println("Línea 4 coincide con "+comandos[i]+" la posición del arreglo fue "+i);
                    }else if(linea5.equals(comandos[i])){
                        System.out.println("Línea 5 coincide con "+comandos[i]+" la posición del arreglo fue "+i);
                    }else if(linea6.equals(comandos[i])){
                        System.out.println("Línea 6 coincide con "+comandos[i]+" la posición del arreglo fue "+i);
                    }else{
                        JOptionPane.showMessageDialog(null,"Hay un error en la sintaxis en la línea del archivo de comandos "+comandos[i]);
                    }
                }
                 
        } catch (IOException ex) {

        }
    }
}
