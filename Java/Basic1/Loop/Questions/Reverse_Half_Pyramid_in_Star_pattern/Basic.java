/*

* * * * *
* * * *
* * * 
* *
*

n = 5;

i = 1  j = 5  j= 5-1 +1  = 5
i = 2  j = 4  j = 5-2 +1 = 4
i = 3  j = 3  j = 5-3 +1 = 3
i = 4  j = 2  j = 5-4 +1 = 2
i = 5  j = 1  j = 5-5 +1 = 1

i = 1; i <= n; i++
j = 1; j < n-i+1; j++

*/


// public class Basic {
//     public static void main(String args[]){
//         for(int i = 1; i <= 5; i++){
//             for(int j = 1; j <= 5-i+1; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

/*
Output

* * * * * * 
* * * * * 
* * * * 
* * * 
* *
*

*/




public class Basic {
    public static void main(String args[]){
        for(int l=1; l<=6; l++){
            for(int m=1; m <= l; m++){
                System.out.print("* ");
            }
        System.out.println();
        }

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5-i+1; j++){
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
* * * *
* * * 
* *
*

*/