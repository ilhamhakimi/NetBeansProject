package alumniKPD;
import alumniKVBP.JabatanPengajian;
import alumniKVBP.AhliAlumni;
import java.io.*;
public class AlumniKPD {
    public static void main(String args[]) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        
        System.out.print("Masukkan Nama : ");
        String nama = input.readLine();
        
        System.out.print("Masukkan Nama Jabatan(SR [Seni Reka] / TM [Teknologi Maklumat]) : ");
        String jabatan = input.readLine();
        
        System.out.print("Masukkan Tahun Konvo : ");
        int konvo = Integer.parseInt(input.readLine());
        
        System.out.println("===============================================================");
        System.out.println("[Maklumat Alumni]");
        System.out.println("Nama : "+nama);
        System.out.println("Jabatan : "+jabatan);
        System.out.println("Tahun Konvo : "+konvo);
        
        JabatanPengajian objek = new JabatanPengajian();
        objek.semakYuran(jabatan);
        AhliAlumni objek1 = new AhliAlumni();
        objek1.semakKategori(konvo);
    }
}
