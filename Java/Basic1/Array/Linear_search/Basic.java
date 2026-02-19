public class Basic {
    public static int linerSearch(int arr[], int find){

         for(int i = 0; i < arr.length; i++){
            if( arr[i] == find){
                return i;
            }
         }
         return -1;
    }

    public static void main(String args[]){
        int arr[] = {1, 5, 8, 4, 9, 0,2, 3};
        int find = 10;
        int index = linerSearch(arr, find);

        if(index == -1){
            System.out.print("Not Found");
        } else {
           System.out.print(index);
        }
    }
}