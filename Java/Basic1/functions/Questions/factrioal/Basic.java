public class Basic {
    public static int factrioal(int n){
        int f = 1;

        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String args[]){
        int n =5;
        int result = factrioal(n);
        System.out.println(result);
    }
}