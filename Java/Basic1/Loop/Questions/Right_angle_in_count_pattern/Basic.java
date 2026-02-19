public class Basic {
    public static void main (String args[]){
        int count = 1;
        for(int line = 1; line<=5; line++){
            for(int row = 1; row<=3; row++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
        
    }
}