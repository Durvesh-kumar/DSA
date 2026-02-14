public class Basic {
    public static void main (String args[]){
        int income = 200000;

        if(income < 500000){
               System.out.print("No Inocme Text");
        } else if(income > 500000 || income < 1000000){
           System.out.print((income * 20)/100);
        } else if(income > 1000000){
            System.out.print((income * 30)/100);
        }
    }
}