import java.util.*;

public class Basic {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter any number. I will print star patterns increase\nPlease enter number: ");
         int n = sc.nextInt();
         for(int line = 1; line <= n; line++){
             for(int star = 1; star <= line; star++){
                System.out.print("*");
             }
             System.out.println();
         }
    }
}