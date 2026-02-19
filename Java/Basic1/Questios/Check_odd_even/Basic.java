import java.util.*;

public class Basic {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number. I will check this is even or odd\n Enter here: ");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("Number is even: " + n);
        } else {
            System.out.println("Number is odd: " + n);
        }
    }
}