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
public class Test7 {
    public static void main(String args[])
    {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        
        double jejari, luasbulatan ;
        
        System.out.println("Jejari : ");
        jejari=Double.parseDouble (input.readLine());
        
   luasbulatan = kiraluas(jejari);
   System.out.println("Jejari = "+jejari);
   System.out.println("Luas bulatan = "+luasbulatan );
     }
   static double kiraluas(double jejari)
   {
        double luas;
        luas = 3.142 * jejari * jejari;
        return luas;
   }
      }
