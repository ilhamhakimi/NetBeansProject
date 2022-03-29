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
public class Test5 {
    public static void main(String args[])throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
                
        System.out.println("Masukkan huruf : ");
        char warna = (char) input.read();
        
        switch(warna){
            case 'B': System.out.println("Warna Biru");break;
            case 'H': System.out.println("Waarna Hijau");break;
            case 'P': System.out.println("Warna Putih");break;
            case 'M': System.out.println("Warna Merah");break;
            default : System.out.println("Warna tidak tersenarai"); break;
}        
}
}
