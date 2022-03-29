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
public abstract class calculator {
public double no1, no2;
    abstract void display();
    abstract void evaluate();
}
    
    public class addition extends calculator{
        
        public void display(){
           System.out.println(no1+no2);
        }
        public double getadd(){
            return no1+no2;
        }
        public void evaluate(){
            System.out.println(no1+" + "+no2);
        }
    }
        
    public class division extends calculator{

	   public void display(){
		   System.out.println(no1+no2);
	   }
	   public double getadd() {
		   return no1 / no2;
	   }
	   public void evaluate(){
		   System.out.println(no1+" / "+no2);
	   
           }
	   }
    
    public class substraction extends calculator {
    public void display(){
	   System.out.println(no1+"-"+no2 );
    }

    public void evaluate(){
	   System.out.println(no1-no2);
    }
    }

    public class multiplication extends calculator{
	  
    public void display(){
	   System.out.println(no1*no2);
    }
    public void evaluate(){
	   System.out.println(no1+" * "+no2);
    }
    public double getmult() {
	 return no1*no2;
    }
    }

    public class number extends calculator{
	void display() {
	}
	void evaluate() {
	}
    }

public class operator extends calculator{
	void display() {
	}
	void evaluation() {
	}
}
