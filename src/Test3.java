/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ILHAM HAKIMI
 */

import java.io.*;
public class Test3 {
    public static void main(String args[])throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        
        String nama;
        int umur;
        double tinggi;
        
        System.out.print("Nama : ");
        nama= input.readLine();
        
        System.out.print("Umur : ");
        umur=Integer.parseInt (input.readLine());
        
        System.out.print("Tinggi : ");
        tinggi=Double.parseDouble (input.readLine());
        
        System.out.println("Output = ");
        
        System.out.println("Nama : " +nama);
        System.out.println("Umur : " +umur);
        System.out.println("Tinggi : " +tinggi);
    }
}
