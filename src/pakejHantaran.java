/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ILHAM HAKIMI
 */

import java.io.*;

public class pakejHantaran {

    public static void main (String args[])throws IOException
    {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        String jenisDulang, tempoh, ahli, pakej;
        double hargaKeseluruhan, hargaPakej, hargaJenisDulang, jumlahHarga;
        int bilDulang;
        // ini ialah paparan input
        
        System.out.println("=================");
        System.out.println("Dulang Tanpa Tapak");
        System.out.println("Dulang Tapak Tinggi");
        System.out.println("Box Kaca");
        System.out.println("=================");
        
        System.out.print ("Sila Pilih Jenis Dulang Hantaran : ");
        jenisDulang = input.readLine();
        
        System.out.println("=================");
        System.out.println("Pakej Hantaran A | Dulang Sahaja");
        System.out.println("Pakej Hantaran B | Dulang + Bunga + Ribena");
        System.out.println("Pakej Hantaran C | Dulang + Bunga + Ribena + Upah Hias");
        System.out.println("=================");
        
        System.out.print ("Sila Pilih Pakej (A/B/C) : ");
        pakej = input.readLine();
        System.out.print ("Masukkan Bilangan Dulang Yang Dikehendaki : ");
        bilDulang = Integer.parseInt(input.readLine());
        
        hargaJenisDulang=hargaJenisDulang(jenisDulang);
        hargaPakej=hargaPakej(pakej);
        jumlahHarga=(hargaJenisDulang*bilDulang)+hargaPakej;
        hargaKeseluruhan=hargaKeseluruhan(hargaJenisDulang, bilDulang);
       
        //paparan output
        System.out.println("            Maklumat Tempahan");
        System.out.println("Jenis Dulang : " +jenisDulang);
        System.out.println("Harga Sewaan 1 Dulang : " +hargaJenisDulang);
        System.out.println ("Pakej Hantaran : "+pakej);
        System.out.println("Harga Pakej 1 Dulang : " +hargaPakej);
        System.out.println ("Bilangan Dulang : "+bilDulang);
        System.out.println ("Jumlah Harga (RM) : "+hargaKeseluruhan);
    }
    
    static double hargaJenisDulang(String jenisDulang)
    {
        int harga;
        if ("Dulang Tanpa Tapak".equals(jenisDulang))
            harga = 10;
        else if ("Dulang Tapak Tinggi".equals(jenisDulang))
            harga = 12;
        else if ("Box Kaca".equals(jenisDulang))
            harga = 20;
        else harga = 0;
       
        return harga;
    }
    
    static double hargaPakej (String pakej)
    {
        double harga;
                if ("A".equals(pakej))
            harga = 0.00;
        else if ("B".equals(pakej))
            harga = 5.00;
        else if ("C".equals(pakej))
            harga = 10.00;
        else harga = 0;
        
        return harga;
    }
    
    static double hargaKeseluruhan (double harga,int bilDulang)
    {
        double jumlah;
        if (bilDulang>=10)
        {
         harga=harga*90/100;
        }
        else harga = harga;
        return harga;
    }
}