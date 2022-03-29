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
public class salary {
    
    static String[] nama = new String[3];
    static double gajijan [] = new double [3];
    static double gajifeb [] = new double [3];
    static double gajimac [] = new double [3];
    static char choice;
    
    public static void main (String args []) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        int option;
        do{
        menu();
        
        option=Integer.parseInt(input.readLine());
        if(option==1){
            insert();
        }else if(option==2){
            displayData();
        }else if(option==3){
            print();
        }
    System.out.println("Continue? [Y/N");
    choice = (char) input.read();
    } while (choice == 'y' || choice =='Y');
 }

    static void menu(){
        System.out.println("1. Masukkan nama dan gaji pekerja.");
        System.out.println("2. Paparan jumlah gaji bulanan.");
        System.out.println("3. Paparan gaji mengikut pekerja.");
    }
    static void insert() throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        for(int i=0;i<3;i++){
            System.out.println("Masukkan nama pekerja : ");
            nama[i] = input.readLine();
            System.out.println("Masukkan gaji bulan Januari : ");
            gajijan[i] = Double.parseDouble(input.readLine());
            System.out.println("Masukkan gaji bulan Februari : ");
            gajifeb[i] = Double.parseDouble(input.readLine());
            System.out.println("Masukkan gaji bulan Mac : ");
            gajimac[i] = Double.parseDouble(input.readLine());
        }
    }
    static void displayData() {
    
    }
    static void getSum(){
        int jumlahgajibulanan = 0;
        for(double i : gaji){
            jumlahgajibulanan +=i;
        }
    }
}
