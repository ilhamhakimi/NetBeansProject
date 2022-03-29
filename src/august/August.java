
package august;
import java.io.*;
/* @author ILHAM HAKIMI & Aliyan*/
public class August {

    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
            String string1, string2;
            int bilstring;
        
            System.out.println("Sila taipkan ayat pertama bagi mencuba method length() : ");
            string1 = input.readLine();
            
            System.out.println("Sila taipkan ayat kedua bagi mencuba method length() : ");
            string2 = input.readLine();
            
            if(string1.length()>0) {  
            System.out.println("Panjang string pertama ialah : "+string1.length());
            }else{
            System.out.println("Error");
            }
            
            if(string2.length()>0) {  
            System.out.println("Panjang string kedua ialah : "+string2.length());
            }else{
            System.out.println("Error");
            }
    }
    
    } 
static void StringBuffer throws IOException {
  
          StringBuffer sb1 = new StringBuffer("value1 is ");  
          System.out.println("string1: "+sb1);  
       // inserting boolean argument  
          sb1.insert(10,true);  
          // print the StringBuffer after inserting  
          System.out.println("after insert: " + sb1);  
  
          StringBuffer sb2 = new StringBuffer("two is greater then one? ");  
          System.out.println("string2: " + sb2);  
            
          // inserting boolean argument      
          sb2.insert(sb2.length(),false);  
            
          // print the string buffer after inserting  
          System.out.println("after insert: " + sb2); 
}
