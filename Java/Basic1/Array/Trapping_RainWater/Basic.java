public class Basic {
    public static void trappingRainWater(int hight[]){

        // Calculate left max boundary for each element in the array
        int left_max[] = new int[hight.length];
        left_max[0] = hight[0];
        for(int i=1; i<hight.length; i++){
            if(hight[i]> left_max[i-1]){
                left_max[i] = hight[i];
                
            }
        }

        // Calculate right max boundary for each element in the arrayd

    }
    public static void main(String args[]){
        int hight[] = {1,2,3,4,5,6,7};
        trappingRainWater(hight);
    }
}