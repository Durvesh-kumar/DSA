import java.util.*;

// public class Basic {
//     public static void main(String args[]){
//         int counter = 0;
//         while (counter < 10){
//             System.out.println(counter + " " +"hello , World");
//             counter ++;
//         }
//     }
// }

// public class Basic {
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter please any number");
//         int n = sc.nextInt();
//         int counter = 1;
//         while (counter <= n){
//             System.out.println(counter + " " +"hello , World");
//             counter ++;
//         }
//     }
// }

// Sum n numbers

public class Basic {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter please any number");
        int n = sc.nextInt();
        int sum = 0;
        int start = 1;
        while (start <= n){
           sum += start;
            start ++;
        }

        System.out.print("Totle sum of natural numbers" + " " + sum);
    }
}