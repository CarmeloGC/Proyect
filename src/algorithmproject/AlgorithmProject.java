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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JOptionPane;
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
       File p = null;
        String asc = "";
        String desc = "";
        ArrayList<variables> hl = new ArrayList();
        File coman = null;
        FileReader fr = null;
        BufferedReader br = null;

        int lineas = 0;

        try {
            coman = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\commands.txt");
            fr = new FileReader(coman);
            br = new BufferedReader(fr);
            String ascd[] = null;
            String des[] = null;
            String wer[] = null;

            String line = "";
            while ((line = br.readLine()) != null) {
                String arre[] = line.split(" ");

                for (int i = 0; i < arre.length; i++) {
                    if (arre[i].equals("create")) {
                        variables var = new variables();
                        String new1 = "";
                        String[] pp = arre[1].split("");
                        for (int j = 0; j < pp.length; j++) {
                            if (!pp[j].equals("\"")) {
                                new1 = new1 + pp[j];
                            }
                        }
                        String namevar = arre[3];
                        var.setNvar(namevar);
                        var.setNarch(new1);
                        //System.out.println(nuevo);
                        String ruta = "C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\" + new1;

                        p = new File(ruta);
                        if (!p.exists()) {
                            p.createNewFile();
                            
                        } else {
                            System.out.println("The file already exists");
                        }

                        hl.add(var);

                    } else if (arre[0].equals("assign")) {
                        String new2 = "";
                        String line1 = "";
                        String line2 = "";
                        String nm123 = "";
                        String qw[] = arre[1].split("");
                        for (int t = 0; t < qw.length; t++) {
                            if (!qw[t].equals("\"")) {
                                nm123 = nm123 + qw[t];
                            }
                        }
                        variables var2 = new variables();
                        File file = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\" + nm123);
                        FileReader fr2 = new FileReader(file);
                        BufferedReader br2 = new BufferedReader(fr2);
                        while ((line1 = br2.readLine()) != null) {
                            line2 = line2 + line1;
                        }

                        des = line2.split(" ");
                        ascd = line2.split(" ");

                        Arrays.sort(ascd);
                        Arrays.sort(des, Collections.reverseOrder());
//                      
                        for (int w = 0; w < des.length; w++) {
                            desc = desc + des[w];
                        }
                        String we[] = arre[1].split("");
                        for (int j = 0; j < we.length; j++) {
                            if (!we[j].equals("\"")) {
                                new2 = new2 + we[j];
                            }
                        }
                        String namvar = arre[3];
                        var2.setNarch(new2);
                        var2.setNvar(namvar);

                        hl.add(var2);
                        System.out.println("The file was assigned " + new2 + " to the variable " + namvar);

                    } else if ((arre[1].equals("=") && arre[2].equals("sort") && arre[4].equals("asc"))) {

                        String li = "";
                        if (!hl.isEmpty()) {
                            for (int y = 0; y < hl.size(); y++) {

                                if (hl.get(y).getNvar().equals(arre[0])) {

                                    String a = hl.get(y).getNarch();
                                    File file323 = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\" + a);
                                    FileWriter fw = new FileWriter(file323);
                                    BufferedWriter BW = new BufferedWriter(fw);
                                    PrintWriter pw = new PrintWriter(BW);
                                    for (int q = 0; q < ascd.length; q++) {
                                        pw.println(ascd[q]);
                                    }

                                    pw.close();
                                    BW.close();

                                }

                            }
                        } else {
                            System.out.println("Vacío");
                        }

                    } else if ((arre[1].equals("=") && arre[2].equals("sort") && arre[4].equals("desc"))) {
                        for (int n = 0; n < hl.size(); n++) {

                            if (hl.get(n).getNvar().equals(arre[0])) {

                                String a = hl.get(n).getNarch();
                                File file323 = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\" + a);
                                FileWriter fw = new FileWriter(file323);
                                BufferedWriter BW = new BufferedWriter(fw);
                                PrintWriter pw = new PrintWriter(BW);
                                for (int q = 0; q < des.length; q++) {
                                    pw.println(des[q]);
                                }

                                pw.close();

                            }

                        }
                        String er[];
                        er = line.split(" ");
                    } else if (arre[1].equals("=") && arre[2].equals("rem_doubles")) {
                        for (int z = 0; z < hl.size(); z++) {
                            if (hl.get(z).getNvar().equals(arre[3])) {
                                for (int f = 0; f < ascd.length; f++) {
                                    for (int k = 0; k < ascd.length - 1; k++) {
                                        if (f != k) {
                                            if (ascd[f].equals(ascd[k])) {
                                            ascd[f] = "";
                                            }
                                        }
                                    }
                                }
                            }
                            if (hl.get(z).getNvar().equals(arre[0])) {
                                String par = hl.get(z).getNarch();
                                File dw = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\" + par);
                                FileWriter fr11 = new FileWriter(dw);
                                BufferedWriter BW3 = new BufferedWriter(fr11);
                                PrintWriter pw23 = new PrintWriter(BW3);
                                for (int m = 0; m <= ascd.length - 1; m++) {
                                    if (ascd[m] != "") {
                                        pw23.println(ascd[m]);
                                    }
                                }
                                pw23.close();
                            }
                        }
                    } else if (arre[1].equals("=")) {
                        String hg[] = null;
                        for (int o = 0; o < hl.size(); o++) {
                            System.out.println(hl.get(o));
                            if (hl.get(o).getNvar().equals(arre[2])) {
                                String line13;
                                String zx = hl.get(o).getNarch();
                                String de = "";
                                File nm = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\" + zx);
                                FileReader frq3 = new FileReader(nm);
                                BufferedReader BFEW = new BufferedReader(frq3);
                                while ((line13 = BFEW.readLine()) != null) {
                                    de = de + " " + line13;
                                }
                       
                                hg = de.split(" ");
                            } else {
 
                            }
                            if (hl.get(o).getNvar().equals(arre[0])) {
                                String cx = hl.get(o).getNarch();
                                File cg = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\" + cx);
                                FileWriter FW57 = new FileWriter(cg);
                                BufferedWriter bw65 = new BufferedWriter(FW57);
                                PrintWriter pw9 = new PrintWriter(bw65);
                                for (int u = 0; u < hg.length; u++) {
                                    pw9.println(hg[u]);
                                }
                                pw9.close();
                            } else {
                                System.out.println("nos");
                            }
                        }

                    } else if (arre[1].equals("=") && arre[3].equals("+")) {
                        String as ="";
                        String as2 = "";
                        String res = "";
                        int cont=0;
                        for (int r = 0; r < hl.size(); r++) {
                            if (hl.get(r).getNvar().equals(arre[2])) {
                                String jk = hl.get(r).getNarch();
                                String aq;

                                File bv = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\" + jk);
                                FileReader hj = new FileReader(bv);
                                BufferedReader brw = new BufferedReader(hj);
                                
                                while ((aq = brw.readLine()) != null) {
                                    as= as+aq;
                                }
                                
                                
                            }
                            if (hl.get(r).getNvar().equals(arre[4])) {
                                String hj = hl.get(r).getNarch();
                                String aw;
                                File bv1 = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\" + hj);
                                FileReader hj1 = new FileReader(bv1);
                                BufferedReader brw1 = new BufferedReader(hj1);
                                while ((aw = brw1.readLine()) != null) {
                                    as2 = as2 + aw + "\n";
                                }
                            }
                            res = as + as2;
                          
                            if(hl.get(r).getNvar().equals(arre[0])){
                               String klñ= hl.get(r).getNarch();
                               File bv12 = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\AlgorithmProject\\" + klñ);
                               FileWriter fgr12= new FileWriter(bv12);
                               BufferedWriter fgtr= new BufferedWriter(fgr12);
                               PrintWriter pw123= new PrintWriter(fgtr);
                               pw123.println(res);
                               pw123.close();
                            }
                        }
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    }else{
                        
                    }
                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
