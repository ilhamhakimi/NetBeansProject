package alumniKVBP;
public class AhliAlumni {
    public void semakKategori(int konvo){
        String kategori;
        int span=2022-konvo;
        
        if(span>=5)
            kategori = "Super Senior";
        else if(span<=4)
            kategori = "Senior";
        else
            kategori = "error";
            
        System.out.println("Kategori Keahlian anda : "+kategori);
    }
}