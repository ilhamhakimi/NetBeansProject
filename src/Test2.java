/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ILHAM HAKIMI
 */
import java.util.Scanner;
public class Test2 {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("[Pendaftaran KVBP]");
        
        System.out.print("Nama : ");
        String nama = input.next();
        
        System.out.print("Umur : ");
        int umur = input.nextInt();
        
        System.out.print("Tinggi : ");
        double tinggi = input.nextDouble();
        
        input.close();
       
        System.out.println("Output : ");
        
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Tinggi : " + tinggi);
    }
}
