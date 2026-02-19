public class Basic {
    public static void pairs(int num[]){
        for(int i =0; i<num.length; i++){
            int current = num[i];
            for(int j = i+1; j<num.length; j++){
                System.out.print("(" + current + "," + num[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int num[] = {1,2,3,4,5,6,7,8,9};
        pairs(num);
    }
}