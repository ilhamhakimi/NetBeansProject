
package bankKPD;

public class BantuanSiswa {
    public void semakBantuan (String kategori){
        int bantuan;
        
        if(kategori.equals("Sijil")){
            bantuan=100;
            System.out.println("Jumlah Bantuan Yang Diterima Untuk Kategori Sijil : "+bantuan);
        }else if(kategori.equals("Diploma")){
            bantuan=250;
            System.out.println("Jumlah Bantuan Yang Diterima Untuk Kategori Diploma : "+bantuan);
        }else{
            bantuan=0;
            System.out.println("error");
        }
    }
}
