/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpa1;

import java.io.*;

/**
 *
 * @author ILHAM HAKIMI
 */
class NasiFood {
    double harga, hargaNasi, caj;
}

class NasiTomatoFood extends NasiFood{
    
    Double kira(Double kuantiti){
        caj = 10.00;
        harga = (8.00 * kuantiti)+caj;
        return harga;
    }
}

class NasiAyamPenyet extends NasiFood{
    Double kira(Double kuantiti){
        caj = 12.00;
        harga = (9.50 * kuantiti)+caj;
        return harga;
    }
}

class JumlahFood extends NasiFood{
    public static void main (String args [])throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        Double hargaTomato, hargaPenyet, jumlahHarga;
        System.out.println("Kuantiti bagi Nasi Tomato : ");
        Double kuantitiNasiTomato = Double.parseDouble(input.readLine());
        NasiTomatoFood objek = new NasiTomatoFood();
        hargaTomato = objek.kira(kuantitiNasiTomato);
        System.out.println("Kuantiti bagi Nasi Ayam Penyet : ");
        Double kuantitiNasiAyamPenyet = Double.parseDouble(input.readLine());
        NasiAyamPenyet objek1 = new NasiAyamPenyet();
        hargaPenyet = objek1.kira(kuantitiNasiAyamPenyet);
        
        jumlahHarga = hargaTomato+hargaPenyet;
        
        System.out.println("Jumlah harga Nasi Tomato : "+hargaTomato);
        
        System.out.println("Jumlah harga Nasi Ayam Penyet : "+hargaPenyet);
        
        System.out.println("Jumlah harga Nasi Tomato dan Nasi Ayam Penyet : "+jumlahHarga);
    }
}