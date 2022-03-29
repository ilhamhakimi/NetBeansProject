/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ILHAM HAKIMI
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
public class Test8 {
    public static void main(String[] args) {

        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        int hasil, m, n;
        
        System.out.println("M : ");
        m = Integer.parseInt(input.readLine());

        System.out.println("N : ");
        n = Integer.parseInt(input.readLine());
        
        hasil = m+n;

        System.out.println(hasil);
    }
}