import java.util.*;
public class Basic {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number. I will cheak number is prime or not.\n Enter your number: ");
        int n = sc.nextInt();

        if(n==2){
           System.out.print("Is prime: " + n);
        } else {

            boolean isPrime = true;

        for(int i = 2; i <= n-1; i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.print("Is prime: " + n);
        } else{
            System.out.print("Is not prime: " + n);
        }
        }
    }
}