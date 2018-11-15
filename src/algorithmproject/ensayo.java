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
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ensayo {

    public static void main(String[] args) {
        String comandos[] = new String[7];
        comandos[0] = "create \"ans.txt\" as file_out";
        comandos[1] = "create \"tmp.txt\" as tmp";
        comandos[2] = "assign \"test.txt\" to file_in";
        comandos[3] = "tmp = sort file_in asc";
        comandos[4] = "tmp = rem_doubles tmp";
        comandos[5] = "file_out = tmp";
        String arreComm[];
        int cont = 0;
        boolean pass = true;
        String line = " ";
        //Read commands file 
        File coman = null;
        FileReader fr = null;
        BufferedReader br = null;
        //Read commands file again
        FileReader fr2 = null;
        BufferedReader br2 = null;
        //Declare file
        File file_out = null;
        File tmp = null;
        File file_in = null;
        //Read file file_in
        FileReader fr3 = null;
        BufferedReader br3 = null;
        //Write file tmp
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {
            coman = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\commands.txt");
            fr = new FileReader(coman);
            br = new BufferedReader(fr);

            while ((line = br.readLine().trim()) != null) {
                cont++;
                if (line.equals(comandos[0])) {
                    System.out.println("The command is correct: " + line);
                } else if (line.equals(comandos[1])) {
                    System.out.println("The command is correct:  " + line);
                } else if (line.equals(comandos[2])) {
                    System.out.println("The command is correct:  " + line);
                } else if (line.equals(comandos[3])) {
                    System.out.println("The command is correct:  " + line);
                } else if (line.equals(comandos[4])) {
                    System.out.println("The command is correct:  " + line);
                } else if (line.equals(comandos[5])) {
                    System.out.println("The command is correct:  " + line);
                } else {
                    System.out.println("The command " + "(" + line + ")" + " in the line " + cont + " is incorrect");
                    pass = false;
                }
            }
            br.close();
        } catch (Exception e) {
        }
        int contador=0;
        if (pass == true) {
            System.out.println("/////////////////////////////////////////////////");
            try {
                fr2 = new FileReader(coman);
                br2 = new BufferedReader(fr2);
                String lines = "";
                String arre[]=new String[cont+1];
                String cadena = "";
                while ((lines = br2.readLine()) != null) {
                   arre[contador]=lines;
                   contador++;
                   
                    
                    
                    if (arre[0].equals("create") /*&& arre[1].equals("\"ans.txt\"")) */){
                        String nombre=arre[1];
                        String archivo=arre[3];
                        
                        File arch  = new File(nombre);
                        
                            try {
                                arch.createNewFile();
                                System.out.println(file_out.getName() + " it has been created. witn name "+ arre[3]);
                            } catch (IOException e) {
                                System.out.println("File does not exist");
                            }
                        
                    }else if(arre[0].equals("assign")/* && arre[1].equals("\"tmp.txt\"")*/){
                        String assign = arre[1];
                        file_in = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\test.txt");
                        tmp = new File("t");
                        if (!tmp.exists()) {
                            try {
                                tmp.createNewFile();
                                System.out.println(tmp.getName() + " it has been created.");
                            } catch (IOException e) {
                                System.out.println("File does not exist");
                            }
                        }
                    }else if (arre[0].equals("assign") && arre[1].equals("\"test.txt\"")) {
                         file_in = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\test.txt");
                         System.out.println("It has been assigned file_in to test.txt");
                    }else if(arre[0].equals("tmp")&& arre[2].equals("sort")&& arre[3].equals("file_in")){
                        String cadena5 = "";
                        String cadena1 = "";
                        String[] cadenas;
                        try{
                        fr3 = new FileReader(file_in);
                        br3 = new BufferedReader(fr3);
                        while ((cadena = br3.readLine()) != null) {                            
                            cadena1 = cadena1 + cadena;
                        }
                        cadenas = cadena1.split(" ");
                        Arrays.sort(cadenas);
                        fw = new FileWriter(tmp,true);
                        bw = new BufferedWriter(fw);
                        pw = new PrintWriter(bw);
                        //Falta quitar los dobles
                            for (int i = 0; i < cadenas.length; i++) {
                                pw.println(cadenas[i]);
                            }
                            pw.close();
                        }catch(IOException e){
                            System.out.println("The file could'nt be read");
                        }
                    }
                } 
                try{
                String vector[] = null;
                String namefile;
                String arch1;
                for (int i = 0; i < cont+1; i++) {
                    System.out.println("hola");
                    vector = arre[i].split(" ");
                    for (int j = 0; j < vector.length; j++) {
                        if(vector[j].equals("create")){
                            namefile = vector[j+1];
                            arch1=vector[j+2];
                            File file = new File(JOptionPane.showInputDialog(null,""));
                            try{
                               file.createNewFile();
                               
                            }catch(IOException e){
                                System.out.println(e);
                            }
                            System.out.println("Se creó el archivo, "+vector[j+1]+vector[j+3]+namefile+" exitosamente");
                        }else if(vector[j].equals("assign")){
                            
                        }
                            
                        
                            
                    }
                }
                }catch(NullPointerException e){
                    
                }
                 //arre = cadena.split(" ");
//                for(int i=0; i<arre.length; i++){
//                System.out.println(arre[i]);
//                }
                br2.close();
            } catch (IOException ex) {
                System.out.println("The file could'nt be read.");;
            }
        } else {
            System.out.println("There is an incorrect command, correct it.");
        }
    }
}
