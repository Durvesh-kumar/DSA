public class Basic {
    public static void subArray(int arr[]){
        int current_sum =0;
        int max_value = Integer.MIN_VALUE;
        int prifix_sum[] = new int[arr.length];
        prifix_sum[0] = arr[0];
        for(int i=1; i<prifix_sum.length; i++){
            prifix_sum[i] = prifix_sum[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++){
            int start = i;
            System.out.println("Start: "+ start);
            for(int j=i; j<arr.length; j++){
                int end = j;
                System.out.println("End: "+ end);
                current_sum = start == 0 ? prifix_sum[end] : prifix_sum[end] - prifix_sum[start-1];

                if(current_sum > max_value){
                    max_value = current_sum;
                }
            }
        }
        System.out.println("Max Value: " + max_value);

    }
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        subArray(arr);
    }
}