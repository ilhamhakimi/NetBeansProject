/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ILHAM HAKIMI
 */

//superclass = "subclass"
public class subclass {
    int no1, no2;
    String nama;
}
//subclass is sub1 & sub2
class sub1 extends subclass{
    void total(){
        no1 = 12;
        no2 = 28;
        nama = "Ilham";
        int jumlah=no1+no2;
        System.out.println(jumlah+nama);
    }
}
class sub2{
    public static void main (String [] args){
        sub1 objek = new sub1();
        objek.total();
    }
}

