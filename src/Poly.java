
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ILHAM HAKIMI
 */
public class Poly {
    public static void main (String [] args) throws IOException{
        double widthsquare, widthrectangle, length = 10, width=5, side=6;
        countwidth object = new countwidth();
        widthrectangle = object.width(length,width);
        widthsquare = object.width(side);
        System.out.println("Breadth of Rectangle is " +widthrectangle);
        System.out.println("Breadth of Square is " +widthsquare);
}
class Rectangle {
    constructor(length, width) {
        this.length = length;
        this.width = width;
    }

    area() {
        return this.length * this.width;
    }
}

class Square extends Rectangle {
    constructor(width) {
        super(width, width);
    }
}
}