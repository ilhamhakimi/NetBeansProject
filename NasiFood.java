package latihanPA1;

class NasiFood {
double harga,hargaNasi,caj;
Double kira (Double kuantiti)
{
harga = (hargaNasi * kuantiti)+caj;
return harga;
}
}

class NasiTomatoFood extends NasiFood {
Double kira (Double kuantiti)
{
harga = (8.00 * kuantiti)+caj;
return harga;
}
}

class NasiAyamPenyet extends NasiFood {
Double kira (Double kuantiti)
{
harga = (9.50 * kuantiti)+caj;
return harga;
}

}


//okay the last step for this code to work is what ?
//apa kelas seterusnya yg perlu dibuat ?

//okay betulla tu method apa yg perlu ada dlm kelas tu ?

//okay baiklah saya jawab ya

//betul- kita buat last kelas which is JumlahFood
//dalamnya mesti ada method main (supaya atur cara ini boleh dirun kan)
//jelas ya, jumm kita buat

class JumlahFood {
public static void main (String args[]) {

//okay sekarang kita nak buat objek ya utk guna atur cara kt atas

//objek, mesti dari nama kelas
//contoh pertama
Double hargaTomato, hargaPenyet, jumlahHarga;

NasiTomatoFood objek = new NasiTomatoFood ();
hargaTomato = objek.kira(3.0);//3 tu contoh kuantiti nasi tomato yg diorder

//contoh objek kedua
NasiAyamPenyet objek2 = new NasiAyamPenyet ();
hargaPenyet = objek2.kira(4.0);

jumlahHarga = hargaTomato+hargaPenyet;

System.out.println ("Harga Nasi Tomato " +hargaTomato);

System.out.println ("Harga Nasi Ayam Penyet " +hargaPenyet);

System.out.println ("Jumlah Harga Yang Perlu Dibayar" +jumlahHarga);
}
}