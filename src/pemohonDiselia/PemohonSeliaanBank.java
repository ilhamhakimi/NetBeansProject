package pemohonDiselia;
import bankKPD.*;
import java.io.*;
public class PemohonSeliaanBank {
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
        System.out.print("Bulan Permohonan Dibuat : ");
        int bulan = Integer.parseInt(input.readLine());
        System.out.print("Kaedah Untuk Terima Kad Siswa [Pos | Pickup] : ");
        String kaedah = input.readLine();
        
        System.out.println("==================");
        System.out.println("Maklumat Pemohon");
        System.out.println("==================");
        System.out.println("Nama Pemohon : "+nama);
        BantuanSiswa objek1 = new BantuanSiswa();
        objek1.semakBantuan(kategori);
        PermohonanKad objek2 = new PermohonanKad();
        objek2.semakStatus(bulan);
        KadSiswa objek3 = new KadSiswa();
        objek3.terimaKad(kaedah);
    }
}
