public class Basic {
    public static void swap(int a, int b){
        int store = a;
        a = b;
        b = store;
        System.out.println(a + " " + b);
    }

    public static void main(String args[]){
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}