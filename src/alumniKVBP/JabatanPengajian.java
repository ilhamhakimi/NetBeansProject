package alumniKVBP;
public class JabatanPengajian {
    public void semakYuran(String jabatan){
        String fee;
        if (jabatan.equals("SR"))
            fee="RM25.00";
        else if(jabatan.equals("TM"))
            fee="RM20.00";
        else
            fee="error";
            
        System.out.println("Yuran Keahlian anda : "+fee);
    }
    
}
