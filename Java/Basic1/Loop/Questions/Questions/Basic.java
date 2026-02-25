public class Basic {
     /*

          * 
        * * 
      * * * 
    * * * * 
  * * * * *
  */
    // public static void main(String args[]){
    //     for(int i=1; i<=5; i++){
    //         for(int j=i; j<=5; j++){
    //             System.out.print("  ");
    //         }
    //         for(int k=1; k<=i; k++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    /*
    * * * * * 
      * * * * 
        * * * 
          * * 
            * 
    */

//  public static void main(String args[]){
//     int n = 5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i-1; j++){
//                 System.out.print("  ");
//             }
//             for(int k=1; k<=n-i+1; k++){
//                 System.out.print("* ");
//             } 
//             System.out.println();
//         }
//     }

/*
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
*/

//  public static void main(String args[]){
//     int n = 5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print("  ");
//             }
//             for(int k=1; k<=i; k++){
//                 System.out.print(k + " ");
//             } 
//             for(int l= i-1; l>=1; l--){
//                 System.out.print(l + " ");
//             }
//             System.out.println();
//         }
//     }

/*
				1		
			2		3		
		4		5		6		
	7		8		9		10		
11		12		13		14		15
*/

//  public static void main(String args[]){
//         int n = 5, count = 1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print("\t");
//             }
//             for(int k=1; k<=i; k++){
//                 System.out.print(count + "\t\t");
//                 count++;
//             } 
          

//             System.out.println();
//         }
//     }

/*
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
*/

//  public static void main(String args[]){
//         int n = 5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print("  ");
//             }
//             for(int k=1; k<=2*i-1; k++){
//                 System.out.print("* ");
//             } 
//             System.out.println();
//         }

//         for(int i=1; i<=n-1; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("  ");
//             }
//             for(int k=1; k<=2*(n-i)-1; k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

/*

*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
*/

//  public static void main(String args[]){
//         int n = 5;
//         for(int i=1; i<=n; i++){
            
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             } 
//             for(int k=1; k<=n-i; k++){
//                 System.out.print("  ");
//             }
//             for(int l=1; l<=n-i; l++){
//                 System.out.print("  ");
//             }
//             for(int m=1; m<=i; m++){
//                 System.out.print("* ");
//             } 
//             System.out.println();
//         }

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=(n-i)+1; j++){
//                 System.out.print("* ");
//             }
//             for(int k=1; k<=(i-1); k++){
//                 System.out.print("  ");
//             }
//             for(int l=1; l<=(i-1); l++){
//                 System.out.print("  ");
//             }
//             for(int m=1; m<=(n-i)+1; m++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

/*
        * * * * * 
      * * * * * 
    * * * * * 
  * * * * * 
* * * * * 

*/

// public static void main(String args[]){
//         int n = 5;
//         for(int i=1; i<=n; i++){
            
//             for(int j=1; j<=(n-i); j++){
//                 System.out.print("  ");
//             } 
//             for(int k=1; k<=i; k++){
//                 System.out.print("* ");
//             }
//             for(int l=1; l<=n-i; l++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

public static void main(String args[]){
        int n = 5;
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            } 
            for(int k=1; k<=n; k++){
                if(i==1 || i==n || k==1 || k==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}