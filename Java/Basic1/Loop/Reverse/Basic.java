

// public class Basic {
//     public static void main(String args[]){
//          int n = 10899;
//          while(n > 0){
//             int lastDigit = n%10;
//             System.out.print(lastDigit);
//             n /= 10;
//          }
//     }
// }

public class Basic {
    public static void main(String args[]){
        int reverse = 0;
         int n = 10899;
         while(n > 0){
            int lastDigit = n%10;
            // System.out.print(lastDigit);
            reverse = (reverse * 10) + lastDigit;
            n /= 10;
         }

         System.out.println(reverse);
    }
}