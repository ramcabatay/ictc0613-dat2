
package data_structures;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ACT4B_DAT2_CABATAY {

    public static int[] findLocationDelete(int[] array, int sub){
    if (array == null || sub < 0 || sub >= array.length){
        return array;
    }
    return IntStream.range(array.length) .filter(i -> i != sub)
            .map(i -> array[i]).toArray();
    }
    
public static void main(String[] args) {
     int array[] = {10, 20, 11, 21, 12, 22, 0};
     
     String op;
     Scanner em = new Scanner(System.in);
     System.out.println("Choose the value you want:");
     System.out.println("(a) to insert value");
     System.out.println("(b) to delete value");
     System.out.println("(c) to traverse array");
     System.out.println("(d) to exit");
     System.out.print("Enter the value you want:  ");
     op = em.nextLine();
     
     switch(op){
         case "a":
         {int val;
         int indpos = 6;
         
         System.out.println("Original Array:  "+ Arrays.toString(array));
         System.out.print("Insert the value of array:  ");
         val = em.nextInt();
         for (int i = array.length-1; i > indpos; i--){array[i] = array[i-1];}
         array[indpos] = val;
         System.out.print("Value added : ");
         System.out.println(Arrays.toString(array));break;}
         
         case "b":
               {int sub, i=0;
         System.out.println("Original Array:  "+ Arrays.toString(array));
         System.out.print("Insert the value you want to removed: ");
         sub = em.nextInt();
         array = findLocationDelete(array,sub);
         
         System.out.print("the value removed!!");
         System.out.println(Arrays.toString(array));break;}
         case "c":
         {System.out.println("Traversing array completed!");
         for(int i=0; i < array.length; i++){
             System.out.println(array[i]);}
         break;
         }
         case "d":
         {System.out.println("thankyou for using array!");
         break;}
     }
     
    }   
}
