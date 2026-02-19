public class Basic {
    public static void main(String args[]){
        int number[] = {1, 2, 6, 3, 5};
        int find = 0;

        for(int i = 0; i<number.length; i++){
            if(number[i] > find){
                find = number[i];
            }
        }
        System.out.print(find);
    }
}

/*

length = n
operations = n

worst case 

Time Complexity

O(n)

*/