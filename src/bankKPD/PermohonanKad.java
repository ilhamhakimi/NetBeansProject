package bankKPD;
public class PermohonanKad {
    public void semakStatus(int bulan){
        String status;
        int tempoh=12-bulan;
        
        if(tempoh<=6){
            status="Pemohonan Sedang Diproses";
        }else if(tempoh>=7){
            status="Pemohonan Telah Selesai Diproses";
        }else{
            status="error";
        }
        System.out.println("Status Pemohonan Anda : "+status);
    }
}
