
package act5b_dat2_cabatay;

import java.util.Scanner;
import java.util.LinkedList;

public class ACT5B_DAT2_CABATAY {

    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in).useDelimiter("\n");
    
    System.out.print("How many members information will be entered?    :  ");
    int z=sc.nextInt();
    LinkedList<String> lname = new LinkedList<>();
    LinkedList<String> fname = new LinkedList<>();
    LinkedList<String> mname = new LinkedList<>();
    LinkedList<String> acode = new LinkedList<>();
    LinkedList<String> TelNum = new LinkedList<>();
    LinkedList<String> Gender = new LinkedList<>();
    LinkedList<String> Age = new LinkedList<>();
    
System.out.println("");

    for (int x = 0; x < z; x++)
    {
        int i=1+x;
        System.out.print("Kindly give the information of member #"+i+"\n");
        
        System.out.print("Enter Surname: ");
           lname.add(sc.next());
       
         System.out.print("Enter First Name: ");
           fname.add(sc.next());
       
         System.out.print("Enter Middle Name: ");
           mname.add(sc.next());
          
         System.out.print("Enter area code: ");
           acode.add(sc.next());
        
         System.out.print("Enter telephone number: ");
          TelNum.add(sc.next());
         
         System.out.print("Enter gender: ");
          Gender.add(sc.next());
         
         System.out.print("Enter age: ");
           Age.add(sc.next());
         
          System.out.println("");
    }
    
     for (int y =0 ; y < z; y++)
    {
        
        System.out.println("Welcome to the club "+lname.get(y)+", "+fname.get(y)+" "+mname.get(y)+"!");
        System.out.println("Your area code is "+acode.get(y)+" and your telephone number is "+" "+TelNum.get(y)+"." );
        System.out.println("You are a "+Gender.get(y)+" member and your age is "+Age.get(y)+".");
        System.out.println("");
        
    }
    
     
   }
}