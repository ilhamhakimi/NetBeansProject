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

public class MarkahPelajar {
    
        static String[] nama = new String [3];
        static int markahujian [] = new int [3];
        static int markahmidterm [] = new int[3];
        static int markahfinal [] = new int [3];
        
    public static void main (String args[])throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        int pilihan;
        
        do{
        menu();
        
        pilihan=Integer.parseInt(input.readLine());
        if(pilihan==1){
            insert();
        }else if(pilihan==2){
            calculate();
        }else if(pilihan==3){
            print();
        }else if(pilihan==4){
            
        }
    }while (pilihan!=4);
        /*do{
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
 }*/
        }
    static void menu(){
        System.out.println("1. Masukkan nama pelajar dan markah.");
        System.out.println("2. Kira jumlah markah dan purata markah.");
        System.out.println("3. Paparan markah mengikut pentaksiran.");
        System.out.println("4. Keluar program.");
        System.out.println("");
    }
    static void insert()throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        
        for(int i=0;i<3;i++){
            System.out.println("Masukkan nama pelajar : ");
            nama[i] = input.readLine();
            System.out.println("Masukkan markah awal tahun : ");
            markahujian[i] = Integer.parseInt(input.readLine());
            System.out.println("Masukkan markah pertengahan tahun : ");
            markahmidterm[i] = Integer.parseInt(input.readLine());
            System.out.println("Masukkan markah akhir tahun : ");
            markahfinal[i] = Integer.parseInt(input.readLine());
        }
    }
    static void calculate(){
        int jumlahmarkahujian = 0;
        for(int i : markahujian){
            jumlahmarkahujian += i;
        }
        int puratamarkahujian = jumlahmarkahujian/3;
        
        int jumlahmarkahujianmidterm = 0;
        for(int i : markahmidterm){
            jumlahmarkahujianmidterm += i;
        }
        int puratamarkahujianmidterm = jumlahmarkahujianmidterm/3;
        
        int jumlahmarkahujianfinal = 0;
        for(int i : markahfinal){
            jumlahmarkahujianfinal += i;
        }
        int puratamarkahujianfinal = jumlahmarkahujianmidterm/3;
        int jumlahujian = getSum(markahujian);
        int jumlahmidterm = getSum(markahmidterm);
        int jumlahfinal = getSum(markahfinal);
        System.out.println("Jumlah markah ujian awal tahun : " +jumlahujian);
        
        System.out.println("Jumlah markah ujian pertengahan tahun : " +jumlahmidterm);
        
        System.out.println("Jumlah markah ujian akhir : " +jumlahfinal);
        
        int purataujian = getPurata(markahujian);
        int puratamidterm = getPurata(markahmidterm);
        int puratafinal = getPurata(markahfinal);
        
        System.out.println("Purata markah ujian awal tahun : " +purataujian);
        
        System.out.println("Purata markah ujian pertengahan tahun : " +puratamidterm);
        
        System.out.println("Purata markah ujian akhir tahun : " +puratafinal);
     }
    static int getSum (int [] markah){
        int jumlahmarkahujian = 0;
        for(int i : markah){
            jumlahmarkahujian += i;
        }
        return jumlahmarkahujian;
    }
    static int getPurata (int [] markah){
        int jumlahmarkahujian = 0;
        for(int i : markah){
            jumlahmarkahujian += i;
        }
        int puratamarkah = jumlahmarkahujian/3;
        return puratamarkah;
    }
    static void print(){
        System.out.println("Nama"+"\t"+"Ujian Awal Tahun"+"\t"+"Ujian Pertengahan Tahun"+"\t"+"\t"+"Ujian Akhir Tahun");
        System.out.println("------------------------------------------------------------------------------------");
        for (int a = 0; a<3; a++){
            System.out.println(nama [a]+"\t"+"\t"+ markahujian [a]+"\t"+"\t"+"\t"+ markahmidterm[a]+"\t"+"\t"+"\t"+"\t"+ markahfinal[a]);
        }
    }
}
