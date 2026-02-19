// public class Basic {
//     public static void main(String args[]){
//         for(int i = 1; i <= 5; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

/*
  i = i<=n          m = m<n-i   j = j <= i
*/

public class Basic {
    public static void main(String args[]){
        for(int i = 1; i <= 5; i++){
            for(int m =1; m<=5-i; m++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
Output

    * 
   * *
  * * *
 * * * *
* * * * *
*/