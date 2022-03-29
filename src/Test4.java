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
public class Test4 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("MAsukkan umur anda : ");
        int umur = input.nextInt();
        
        if(umur>=17){
            System.out.println("Anda layak untuk mengambil lesen kereta");
        }else{
            System.out.println("Anda tidak layak mengambil lesen kereta");
        }
        
        System.out.println("Masukkan tinggi anda : ");
        double tinggi = input.nextDouble();
        
        if(tinggi<180){
            System.out.println("Anda pendek lmao");
        }else{
            System.out.println("100% Abang chad");
        }
    }
}
