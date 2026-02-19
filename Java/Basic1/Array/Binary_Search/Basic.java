import java.util.Arrays;
public class Basic {
    /*
    Binary Search is a searching algorithm that works on a sorted array by repeatedli dividing the search space in half

    */

   public static int BinarySearch(int num[], int find){
    int start = 0, end = num.length -1;
    while(start <= end){
        int mid = (start + end)/2;
        if(num[mid] == find){
            return mid;
        }

        if(num[mid] < find){ // right
            start = mid + 1;
        }else {
            end = mid -1;
        }
    }

    return -1;
   }

   public static void main(String args[]){
    int num[] = {1,5, 32,12, 75, 23, 4,};
    // Array must be sorted

    Arrays.sort(num); // sorts in ascending order
    // output [1, 4, 5, 12, 23, 32, 75]
    System.out.print(Arrays.toString(num));

    // find 12 in array

    int index = BinarySearch(num, 75);
    System.out.print(index);
    
   }
}