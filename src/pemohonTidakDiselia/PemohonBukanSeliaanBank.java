package pemohonTidakDiselia;
import bankKPD.BantuanSiswa;
import bankKPD.KadSiswa;
import java.io.*;
public class PemohonBukanSeliaanBank {
public static void main (String args[]) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        
        System.out.println("===========================================");
        System.out.println("Sistem Maklumat Permohonan Kad Siswa KPayD");
        System.out.println("===========================================");
        System.out.println("Masukkan Maklumat Berikut");
        
        System.out.print("Nama Pemohon : ");
        String nama = input.readLine();
        System.out.print("Kategori Pemohon [Sijil | Diploma] : ");
        String kategori = input.readLine();
        System.out.print("Kaedah Untuk Terima Kad Siswa [Pos | Pickup] : ");
        String kaedah = input.readLine();
        
        System.out.println("==================");
        System.out.println("Maklumat Pemohon");
        System.out.println("==================");
        System.out.println("Nama Pemohon : "+nama);
        BantuanSiswa objek1 = new BantuanSiswa();
        objek1.semakBantuan(kategori);
        KadSiswa objek3 = new KadSiswa();
        objek3.terimaKad(kaedah);
    }
}

