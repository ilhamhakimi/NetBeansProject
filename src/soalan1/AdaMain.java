
package soalan1;

interface KelasInterface {
    public void paparInfoKonvo(String program);
    public void semakSidangKonvo(int idKonvo);
}

class GunaInterface implements KelasInterface{
    public void paparInfoKonvo(String program){
        String hari;
        if(program=="KPD"){
            hari = "Isnin";
        }else if(program=="ETE"){
            hari = "Selasa";
        }else if(program=="ETN"){
            hari = "Rabu";
        }else hari = "error";
        
        System.out.println("Hari Konvokesyen adalah pada : "+hari);
    }
    public void semakSidangKonvo(int idKonvo){
        String sidang;
        if(idKonvo < 100){
            sidang = "8.00a.m - 10.00a.m";
        }else if(idKonvo > 99 && idKonvo <150){
            sidang = "10.30a.m - 1.00p.m";
        }else if(idKonvo > 150 && idKonvo < 400){
            sidang = "2.00p.m";
        }else sidang = "error";
    }
}

public class AdaMain {
    public static void main(String args[]){
        GunaInterface objek = new GunaInterface();
        objek.paparInfoKonvo("ETE");
        objek.semakSidangKonvo(180);
    }
}
