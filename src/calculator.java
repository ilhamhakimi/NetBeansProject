/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ILHAM HAKIMI
 */
public class calculator {
    class calculate extends calculator {
    int no1;
    int no2;

    calculate(int no1, int no2) {
        public static void main(String args []){
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("Nombor pertama : ");
        objek.no1 = Integer.parseInt (input.readLine());
        System.out.println("Nombor pertama : ");
        objek.no2 = Integer.parseInt (input.readLine());
    }
    }
    int calculateArea() {
        return (no1 / 2) * no2;
    }

    @Override
    public String toString() {
        return String.format(
                "Triangle with a base of %s and height of %s",
                new Object[]{no1, no2});
    }
}

class Square extends calculator {

    }

    @Override
    int calculateArea() {
        
        return int hasil;
    }

    @Override
    public String toString() {
        return String.format("Square with a side length of %s units", side);
    }
}
}
