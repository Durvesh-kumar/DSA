/*

n
 C  = n!/r!*(n-r)!
  r

*/

public class Basic {
    public static int factrioal(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String args[]){
        int n = 6;
        int r = 2;
        int sub = n-r;
        int fn = factrioal(n);
        int fr = factrioal(r);
        int subn = factrioal(sub);

        int result = fn/(fr*subn);
        System.out.println(result);
    }
}