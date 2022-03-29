
package soalan2;

import java.io.*;
interface Tayangan{
    public void semakFilem(int Tahun);
    public void semakWaktu(String hari);
}
class maklumatTayangan implements Tayangan{
    public void semakFilem (int tahun){
        String filem;
        if(tahun < 3){
            filem = "Buttman";
        }else if(tahun > 2 && tahun < 5){
            filem = "The Unfarted";
        }else filem = "error";
        System.out.println("Filem yang akan ditayang ialah : "+filem);
    }
    
    public void semakWaktu(String hari){
        String waktu;
        if(hari=="Jumaat"){
            waktu = "4.30 p.m";
        }else if(hari=="Sabtu"){
            waktu = "2.00 p.m";
        }else if(hari=="Ahad"){
            waktu = "10.30 a.m";
        }else waktu = "error";
        System.out.println("Waktu tayang ialah : "+waktu);
    }
}

public class SelamatMenonton {
    public static void main (String args[]) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int tahun = Integer.parseInt(input.readLine());
        String hari = input.readLine();
        maklumatTayangan objek = new maklumatTayangan();
        objek.semakFilem(tahun);
        objek.semakWaktu(hari);
    }
}
