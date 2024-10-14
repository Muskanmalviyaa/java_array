//Make a Funcation to add two number and return sum>>>
import java.util.*;
 public class sumTwoNumber{
    public static void addTwoNumber(String sum){
         
       System.out.println(sum);
        
        return;
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        sc.close();
        addTwoNumber("sum of two number is = "+sum);
    }
    
}