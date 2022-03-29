/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbkhas;

/**
 *
 * @author ILHAM HAKIMI
 */
import java.io.*;
public class Salary {
    
    static String[] nama  = new String [3]; 
    static double gajijan [] = new double [3];
    static double gajifeb [] = new double [3];
    static double gajimac [] = new double [3];
    
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        // TODO code application logic here
        int pilihan; 
        String option ;
        do {
            menu();
            System.out.print("Pilihan Anda : ");
            pilihan = Integer.parseInt (input.readLine());        
        switch  (pilihan){
            case 1:
                insert();
            break;
            case 2 : 
                displayData();
            break;
            case 3 :
                print();
            break;
            default: 
                
        }     
        System.out.print("Adakah anda ingin meneruskan program ini? (Y/N) : ");
        option =  input.readLine();
    }while (!"N".equals(option) );
        
        System.out.println ("Terima Kasih kerana telah menggunakan Aplikasi ini!");
    }
    
    static void menu() {
        System.out.println("1. Masukkan Nama dna Gaji Pekerja");
        System.out.println("2. Paparan Jumlah Gaji Bulanan");
        System.out.println("3. Paparan gaji mengikut Pekerja ");
    }   
    static void insert ()throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        
        for ( int i=0; i<3; i++){
        System.out.print ("Masukkan Nama Pekerja : ");
        nama [i] = input.readLine();
        System.out.print ("Gaji Bulan Januari RM: ");
        gajijan [i] = Double.parseDouble ( input.readLine());
        System.out.print ("Gaji Bulan Febeuari RM: ");
        gajifeb [i] = Double.parseDouble (input.readLine());
        System.out.print ("Gaji Bulan Mac RM: ");
        gajimac [i] = Double.parseDouble (input.readLine());
    }
    }
    static void displayData(){
        double jumlahjan = getSum(gajijan);
        double jumlahfeb = getSum(gajifeb);
        double jumlahmac = getSum(gajimac);
        
        System.out.println("Jumlah Gaji Januari RM: " + jumlahjan);
        System.out.println("Jumlah Gaji Februari RM: " + jumlahfeb);
        System.out.println ("Jumlah Gaji Mac RM: " + jumlahmac);
    }
    static float getSum(double [] gaji ){
        double jumlahgaji = 0;
        for (double i : gaji){
            jumlahgaji += i ; 
        }
        
        return (float) jumlahgaji;    
    }
    static void print (){
        System.out.println("nama " + "\t" + "Januari (RM)" +  "\t"  + "Februari (RM)" +  "\t" + "Mac (RM)" ); 
        System.out.println("------------------------------------------------------------------------------");
        for ( int  a=0; a<3 ; a++){
            System.out.println (nama [a] +"\t\t" + gajijan[a] +  "\t\t" + gajifeb[a]  +  "\t" + gajimac[a] );                    
        }
        
    }
}