/*
 * Made by Ilham Hakimi & Aliyan
 * 29/07/2021 1100 - 1300 [2 Hours]
 */
package pb3;
import java.io.*;
/* @author ILHAM HAKIMI & ALIYAN */
public class PB3 {
    
    public static void main (String args[]) throws IOException
    {
        
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println ("Pilih fungsi yang anda mahu mencuba");
        System.out.println ("1. length()");
        System.out.println ("2. trim()");
        System.out.println ("3. replace()");
        System.out.println ("4. substring()");
        System.out.println ("5. insert()");
        
        System.out.print("Masukkan Pilihan Fungsi anda : ");
        
        int pilihan = Integer.parseInt(input.readLine());
        
        if (pilihan == 1)
        {
            length(); 
        }
        else if (pilihan == 2)
            {
               trim();     
            }
        else if (pilihan == 3)
            {
               replace();     
            }
        
        else if (pilihan == 4)
            {
               substring();     
            }
        else if (pilihan == 5)
        {
            insert();
        }
 
        else {
            System.out.println ("Pilihan tidak Wujud");
        }
        
    }
    
    static void length() throws IOException{
        
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        String string1, string2;
        int bilstring;
        
        System.out.println("Sila taipkan ayat pertama bagi mencuba method length() : ");
            string1 = input.readLine();
            
        System.out.println("Sila taipkan ayat kedua bagi mencuba method length() : ");
            string2 = input.readLine();
          
        System.out.println("Panjang string pertama ialah : "+string1.length());
        
        System.out.println("Panjang string kedua ialah : "+string2.length());
    }
    
    static void trim() throws IOException {
        
       BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
       
       System.out.println("Sila taipkan ayat anda : ");
           String ayat1 = input.readLine();
       
       String ayat2 = ayat1.trim();
       
       System.out.println("Hasil trim ayat : ");
       System.out.println (ayat2);

    }
    
    static void replace() throws IOException {
       BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
       
       String string1, c1, c2;
       
        System.out.println("Sila taipkan ayat anda : ");
            string1 = input.readLine();
        
        System.out.println("Sila taipkan huruf yang salah : ");
            c1 = input.readLine();
            
        System.out.println("Sila taipkan huruf yang betul : ");
            c2 = input.readLine();
            
        String hasil = string1.replace(c1, c2);
        
        System.out.println("Ayat baharu ialah: "+hasil);
        
    }

    static void substring() throws IOException {
        
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));     
       
        System.out.println("Masukkan ayat anda : ");
            String s1= input.readLine();
            
        System.out.println("Masukkan nombor substring pertama : ");
            int no1 = Integer.parseInt(input.readLine());
            
        System.out.println("Masukkan nombor substring kedua : ");
            int no2 = Integer.parseInt(input.readLine());
            
        System.out.println("Hasil substring : ");
        System.out.println((s1.substring(no1,no2)));
    }
    
    static void insert() throws IOException { 
        
         BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
         
        System.out.println("Masukkan ayat pertama untuk mencuba method insert(): ");
            String strb1 =input.readLine();
                StringBuffer sb1 = new StringBuffer(strb1);
          
          System.out.println("Masukkan ayat/huruf yang anda mahu masukkan pada ayat tersebut : ");
            String  c1 = input.readLine();
            
          System.out.println("Masukkan nombor bagi menentukan kedudukan ayat yang anda mahu masukkan pada ayat tersebut : ");
            int number1 = Integer.parseInt(input.readLine());
            
          sb1.insert(number1,c1);
          
          System.out.println("Hasil: " + sb1);
          
          System.out.println("Masukkan ayat kedua untuk mencuba method insert(): ");
            String strb2 =input.readLine();
                StringBuffer sb2 = new StringBuffer(strb2);
                
          System.out.println("Masukkan ayat/huruf yang anda mahu masukkan pada ayat tersebut : ");
            String  c2 = input.readLine();
          
          System.out.println("Masukkan nombor bagi menentukan kedudukan ayat yang anda mahu masukkan pada ayat tersebut : ");
            int number2 = Integer.parseInt(input.readLine());
            
          sb2.insert(number2,c2);
          
          System.out.println("Hasil: " + sb2); 
    }
}
