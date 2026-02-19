import java.util.*;
public class Basic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number. I will print HOLLOW RECTANGLE pattern\n Enter here: ");
        int n = sc.nextInt();
        for(int line = 1; line <= n; line++){
            for(int star = 1; star <= n; star++){
                if(line == 1 || line == n || star == 1 || star == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}