/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package January;

/**
 *
 * @author ILHAM HAKIMI
 */
import java.io.*;
public class soalan2 {
    String nama, gred;
    double pb, pa, markah;
    public static void main (String [] args) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        soalan2 pelajar1 = new soalan2 ();
        System.out.println("Nama Pelajar Pelajar 1 : ");
        pelajar1.nama = input.readLine();
        System.out.println("Markah PB Pelajar 1 : ");
        pelajar1.pb = Integer.parseInt (input.readLine());
        System.out.println("Markah PA Pelajar 1 : ");
        pelajar1.pa = Integer.parseInt (input.readLine());
        
        pelajar1.markah = (pelajar1.pa+pelajar1.pb)/2;
        
        pelajar1.gred = semakGred(pelajar1.markah);
        
        //break
        
        soalan2 pelajar2 = new soalan2 ();
        System.out.println("Nama Pelajar 2 : ");
        pelajar2.nama = input.readLine();
        System.out.println("Markah PB Pelajar 2 : ");
        pelajar2.pb = Integer.parseInt (input.readLine());
        System.out.println("Markah PA Pelajar 2 : ");
        pelajar2.pa = Integer.parseInt (input.readLine());
        
         pelajar2.markah = (pelajar2.pa+pelajar2.pb)/2;
        
        pelajar2.gred = semakGred(pelajar2.markah);
        
        //break
        
        soalan2 pelajar3 = new soalan2 ();
        System.out.println("Nama Pelajar 3 : ");
        pelajar3.nama = input.readLine();
        System.out.println("Markah PB Pelajar 3 : ");
        pelajar3.pb = Integer.parseInt (input.readLine());
        System.out.println("Markah PA Pelajar 3 : ");
        pelajar3.pa = Integer.parseInt (input.readLine());
        
         pelajar3.markah = (pelajar3.pa+pelajar3.pb)/2;
        
        pelajar3.gred = semakGred(pelajar3.markah);
        
        //break
        
        soalan2 pelajar4 = new soalan2 ();
        System.out.println("Nama Pelajar 4 : ");
        pelajar4.nama = input.readLine();
        System.out.println("Markah PB Pelajar 4 : ");
        pelajar4.pb = Integer.parseInt (input.readLine());
        System.out.println("Markah PA Pelajar 4 : ");
        pelajar4.pa = Integer.parseInt (input.readLine());
        
        pelajar4.markah = (pelajar4.pa+pelajar4.pb)/2;
        
        pelajar4.gred = semakGred(pelajar4.markah);
        
        //output markah
        System.out.println("Gred dan Markah Pelajar 1 : "+pelajar1.gred +"/"+ pelajar1.markah);
        System.out.println("Gred dan Markah Pelajar 2 : "+pelajar2.gred +"/"+ pelajar2.markah);
        System.out.println("Gred dan Markah Pelajar 3 : "+pelajar3.gred +"/"+ pelajar3.markah);
        System.out.println("Gred dan Markah Pelajar 4 : "+pelajar4.gred +"/"+ pelajar4.markah);
        
    }
        static String semakGred (double markah){
            String gred; 
            if(markah > 89 && markah <=100){
                 gred = "A";}
            else if(markah <90 && markah >=80){
                 gred = "A";}
            else if(markah <80 && markah >=75){
                 gred = "B+";}
            else if(markah <75 && markah >=70){
                 gred = "B";}
            else if(markah <70 && markah >=60){
                 gred = "B-";}
            else if(markah <60 && markah >=50){
                 gred = "C";}
            else if(markah >= 49){
                 gred = "D";}
            else gred = "invalid";
            return gred;
        }
    }

