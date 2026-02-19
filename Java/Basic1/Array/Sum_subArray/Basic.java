public class Basic {
    public static void sumSubArray(int arr[]){
        int total_sum = 0;
        for(int i = 0; i<arr.length; i++){
            total_sum += arr[i];
        }
        System.out.println(total_sum);
    }
    public static void subArray(int arr[]){
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            int start = arr[i];
            for(int j = i+1; j<arr.length; j++){
                int end = arr[j];
                for(int k=start; k<end;  k++){
                    // System.out.print(arr[k]); 
                    sum += k;
                }
                System.out.println(sum + " ");
                // System.out.println();
                
            }
            // System.out.println(sum);
            System.out.println();
        }
        
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        subArray(arr);
    }
}