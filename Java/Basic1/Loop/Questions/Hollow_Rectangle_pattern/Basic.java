public class Basic {
    public static void main(String args[]){
        for(int line = 1; line <= 5; line++){
            for(int row = 1; row <=5; row++){
                if(line == 1 || row == 1 || line == 5 || row == 5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*

Output

* * * * * 
*       *
*       *
*       *
* * * * *

*/