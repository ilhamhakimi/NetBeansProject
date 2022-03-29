package pelajarBaharu;

public class MaklumatPengambilan {
    
    public void paparMaklumatAsas(String kod){
        String program;
        int bilKelas, calon;
        if(kod.equals("ETE")){
            program = "Teknologi Elektrik";
            bilKelas = 2;
            calon = 60;
        }else if(kod.equals("ETN")){
            program = "Teknologi Elektronik";
            bilKelas = 2;
            calon = 60;
        }else if(kod.equals("KPD")){
            program = "Teknologi Sistem Pengurusan Pangkalan Data dan Aplikasi Web";
            bilKelas = 1;
            calon = 25;
        }else if(kod.equals("TM")){
            program = "Teknologi Maklumat";
            bilKelas = 1;
            calon = 20;
        }else if(kod.equals("KRG")){
            program = "Teknologi Reka Bentuk Grafik dan Media Cetak";
            bilKelas = 1;
            calon = 30;
        }else{
            program = "error";
            bilKelas = 0;
            calon = 0;
            System.out.println("input error");
        }
        System.out.println("Program : "+program);
        System.out.println("Bilangan Kelas : "+bilKelas);
        System.out.println("Bilangan Calon : "+calon);
    }
    public void paparStatus (String kod){
        String status;
        if(kod.equals("ETE")){
            status = "Ditawarkan";
        }else if(kod.equals("ETN")){
            status = "Ditawarkan";
        }else if(kod.equals("KPD")){
            status = "Ditawarkan";
        }else if(kod.equals("TM")){
            status = "Tidak ditawarkan";
        }else if(kod.equals("KRG")){
            status = "Ditawarkan";
        }else{
            status = "error";
            System.out.println("input error");
        }
        System.out.println("Status Penawaran Kursus : "+status);
    }
}
