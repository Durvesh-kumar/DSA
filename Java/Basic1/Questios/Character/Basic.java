import java.util.*;
public class Basic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number. I will print HOLLOW RECTANGLE pattern\n Enter here: ");
        int n = sc.nextInt();
        char start = 'A';
        for(int line = 1; line <= n; line++){
            for(int star = 1; star <= line; star++){
              System.out.print(start);
              start++;
            }
            System.out.println();
        }
    }
}