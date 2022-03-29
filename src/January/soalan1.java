/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package January;

/**
 *
 * @author ILHAM HAKIMI
 */
import java.io.*;
public class soalan1 {
    String nama;
    int nomatriks;
    public static void main (String args[]) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        soalan1 objek = new soalan1();
        
        objek.nama = "Nazatul";
        objek.nomatriks = 12345;
        
        System.out.println(objek.nama);
        System.out.println(objek.nomatriks);
    }
    
}
