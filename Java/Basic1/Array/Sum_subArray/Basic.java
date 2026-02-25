public class Basic {
    public static void subArray(int arr[]){
        int current_sum = 0;
        int maxValue = Integer.MIN_VALUE;
      for(int i=0; i<arr.length; i++){
        int start = arr[i];
            for(int j = start; j<arr.length; j++){
                int end = arr[j];
                for(int k = start; k<end; k++){
                    current_sum += arr[k];
                }
                System.out.println(current_sum);
                // maxValue = Math.max(maxValue, current_sum);
                if(current_sum > maxValue){
                    maxValue = current_sum;
                }
            }
            
      }
      System.out.println( "Max Value: " + maxValue); // Output the sum of the current subarray
        
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        subArray(arr);
    }
}