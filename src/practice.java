/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ILHAM HAKIMI
 */
public class practice {
    public static void main (String args []){
        float var1=(float)3.5, var2=(float)4.5, total;
        addition objek = new addition();
        total=objek.add(var1,var2);
        System.out.println(total);
    }
}
class addition{
    static float add(float var1,float var2){
        float total;
        total=var1+var2;
        return total;
    }
}