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
public class MaklumatPelajar {
    String kod, program, jabatan, nama;
    public static void main (String[] args) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        MaklumatPelajar pelajar1 = new MaklumatPelajar();
        System.out.println("Nama Pelajar 1 : ");
        pelajar1.nama = input.readLine();
        System.out.println("Kod Program Pelajar 1 : ");
        pelajar1.kod = input.readLine();
        
        pelajar1.program = semakNamaProgram (pelajar1.kod);
        pelajar1.jabatan = semakNamaProgram (pelajar1.kod);
        
        //break
        
        MaklumatPelajar pelajar2 = new MaklumatPelajar();
        System.out.println("Nama Pelajar 2 : ");
        pelajar2.nama = input.readLine();
        System.out.println("Kod Program Pelajar 2 : ");
        pelajar2.kod = input.readLine();
        
        pelajar2.program = semakNamaProgram (pelajar1.kod);
        pelajar2.jabatan = semakNamaProgram (pelajar1.kod);
        
        //break
        
        MaklumatPelajar pelajar3 = new MaklumatPelajar();
        System.out.println("Nama Pelajar 3 : ");
        pelajar3.nama = input.readLine();
        System.out.println("Kod Program Pelajar 3 : ");
        pelajar3.kod = input.readLine();
        
        pelajar3.program = semakNamaProgram (pelajar1.kod);
        pelajar3.jabatan = semakNamaProgram (pelajar1.kod);
        
        //break
        
        MaklumatPelajar pelajar4 = new MaklumatPelajar();
        System.out.println("Nama Pelajar 4 : ");
        pelajar4.nama = input.readLine();
        System.out.println("Kod Program Pelajar 4 : ");
        pelajar4.kod = input.readLine();
        
        pelajar4.program = semakNamaProgram (pelajar1.kod);
        pelajar4.jabatan = semakJabatan (pelajar1.kod);
        
       
    static String semakNamaProgram (String kod){
        String program;
        if (kod.equals ("DEA")){
            program="Teknologi Elektronik";
        }else if (kod.equals("DEB")){
            program="Teknologi Elektronik";
        }else if (kod.equals("DDB")){
            program="Teknologi Rekabentuk dan Media Cetak";
        }else if (kod.equals("DKB")){
            program="Teknologi Maklumat";
        }else{
            System.out.println("invalid");
        }
    }
    
    static String semakJabatan (String kod){
        String jabatan;
        if (kod.equals ("DEA")){
            jabatan="Elektrik dan Elektronik";
        }else if (kod.equals("DEB")){
            jabatan="Elektrik dan Elektronik";
        }else if (kod.equals("DDB")){
            program="Teknologi Rekabentuk dan Media Cetak";
        }else if (kod.equals("DKB")){
            program="Teknologi Maklumat";
        }else{
            System.out.println("invalid");
    }
}

    


