/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelajarBaharu;
public class SemakanKemasukan {
    public void semakKelas(int id){
        String kelas,ppenasihat;
        if(id <= 30){
            kelas = "1S ETE 1";
            ppenasihat = "Pn Azreen";
        }else if(id <= 60 && id >= 31){
            kelas = "1S ETE 2";
            ppenasihat = "En Hizami";
        }else if(id <= 90 && id >= 61){
            kelas = "1S ETN 1";
            ppenasihat = "Pn Famiza";
        }else if(id <= 120 && id >= 91){
            kelas = "1S ETN 2";
            ppenasihat = "Pn Afifah";
        }else if(id <= 145 && id >= 121){
            kelas = "1S KPD";
            ppenasihat = "Pn Raja Rosmaliani";
        }else if(id <= 175 && id >= 146){
            kelas = "1S KRG";
            ppenasihat = "Pn Hazlina";
        }else{
            kelas = "error";
            ppenasihat="error";
            System.out.println("input error");
        }
        System.out.println("Kelas : "+kelas);
        System.out.println("Pensyarah Penasihat : "+ppenasihat);
    }
}
