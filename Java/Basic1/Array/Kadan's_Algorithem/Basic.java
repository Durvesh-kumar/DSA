public class Basic {
    public static void kadanes(int arr[]){
       int current_sum = 0;
       int max_sum = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
        current_sum += arr[i];
        if(current_sum < 0){
            current_sum = 0;
        }
        // max_sum = Math.max(max_sum, current_sum);
        if(current_sum > max_sum){
            max_sum = current_sum;
        }
       }
       System.out.println("Max Sum: " + max_sum);
    }
    public static void main(String args[]){
        int arr[]= {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}