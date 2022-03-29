package alumniKVBP;
public class KadAlumni {
    public void terimaKad(String kaedah){
        if(kaedah.equals("Pos"))
            System.out.println("Kad Keahlian anda akan dipos mengikut alamat yg diberi.");
        else if(kaedah.equals("Ambil Sendiri"))
            System.out.println("Kad Keahlian anda boleh diambil di pejabat KVBP.");
        else System.out.println("InputError");
    }
}