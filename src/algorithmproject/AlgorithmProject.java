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
        // TODO code application logic here
        File var_id1;
        File var_id2;
        File var_id3;
        String lines = "";
        String lines1 = "";
        String lines2 = "";
        
        try {
            
            var_id1 = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\archivo.txt");
            var_id2 = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\archivo2.txt");
            var_id3 = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\archivo3.txt");
            //Read the file 2
            FileReader fr1 = new FileReader(var_id2);
            BufferedReader br = new BufferedReader(fr1);
            //Read the file 3
            FileReader fr3 = new FileReader(var_id3);
            BufferedReader br3 = new BufferedReader(fr3);
            //Write the file 1
            FileWriter fw1 = new FileWriter(var_id1.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw1);
            PrintWriter pw = new PrintWriter(bw);
            //Write the file 2
            FileWriter fw2 = new FileWriter(var_id2.getAbsoluteFile(), true);
            BufferedWriter bw2 = new BufferedWriter(fw2);
            PrintWriter pw2 = new PrintWriter(bw2);

            try {

                //var_id1 = var_id2
                while ((lines = br.readLine()) != null) {
                    //System.out.println(lines);
                    pw.println(lines);
//                     String a[]= lines.split(" ");
//                     for (int i = 0; i < a.length; i++) {
//                         System.out.println(a[i]);
//                    }
                }
                //var_id2 + var_id3
                while ((lines1 = br3.readLine()) != null) {
                    //System.out.println(lines1);
                    pw2.println(lines1);
                }
                br3.close();
                pw2.close();
                br.close();
                pw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
           
            
            //var_id1 = var_id2+var_id3
            FileReader fr4 = new FileReader(var_id2);
            BufferedReader br4 = new BufferedReader(fr4);
            FileWriter fw4 = new FileWriter(var_id1.getAbsoluteFile(), true);
            BufferedWriter bw4 = new BufferedWriter(fw4);
            PrintWriter pw4 = new PrintWriter(bw4);

            while ((lines2 = br4.readLine()) != null) {
                System.out.println(lines2);
                pw4.println(lines2);
            }
            br4.close();
            pw4.close();

        } catch (Exception e) {
            System.out.println("The file was not found " + e);
        }

    }

}
