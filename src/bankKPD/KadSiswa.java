package bankKPD;
public class KadSiswa {
    public void terimaKad(String kaedah){
        if(kaedah.equals("Pos"))
            System.out.println("Kaedah Terima Kad Siswa : Melalui Pos");
        else if(kaedah.equals("Pickup"))
            System.out.println("Kaedah Terima Kad Siswa : Pickup");
        else System.out.println("InputError");
    }
}
