import java.util.*;

public class Basic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you faverate number between 1 to 10: ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            if (i == n) continue;
            System.out.println(i);
        }
    }
}