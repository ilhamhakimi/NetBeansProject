/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programDitawarkan;
import pelajarBaharu.*;
import java.io.*;
public class KelasDitawarkan {
    public static void main(String args []) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        
        String kodProgram;
        int id;
        
        try{
        System.out.println("Masukkan Kod Program & ID : ");
        kodProgram =input.readLine();
        id = Integer.parseInt(input.readLine());
        MaklumatPengambilan objek = new MaklumatPengambilan();
        SemakanKemasukan objek2 = new SemakanKemasukan();
        
        objek.paparMaklumatAsas(kodProgram);
        objek.paparStatus(kodProgram);
        
        objek2.semakKelas(id);
        }catch(Exception e){
            System.out.println(e);
            System.out.println("input error");
        }
        
    }
}
