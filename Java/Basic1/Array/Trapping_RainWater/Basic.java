public class Basic {
    public static void trappingRainWater(int height[]){
         int hl = height.length;

        // trapped water = [left boundary - right boundary]

        // Calculate left max boundary for each element in the array
        int left_max[] = new int[hl];
        left_max[0] = height[0];
        for(int i=1; i<hl; i++){
            //  left_max[i] = Math.max(height[i], left_max[i-1]);
            if(height[i]> left_max[i-1]){
                left_max[i] = height[i];
            }
        }

        // for(int i=0; i<hl; i++){
        //     System.out.println(left_max[i]);
        // }

        // Calculate right max boundary for each element in the arrayd
        int right_max [] = new int[hl];
        right_max[hl-1] = height[hl-1];

        for(int i = hl-2; i>=0; i--){
               right_max[i] = Math.max(height[i], right_max[i+1]);
        }
//  for(int i=0; i<hl; i++){
//             System.out.println(right_max[i]);
//         }


        int trappedWater = 0;

        //loop
        for(int i=0; i<hl; i++){
            // waterLevel = min(left_max boundry, right_max boundry);
            int waterLevel = Math.min(left_max[i], right_max[i]);

            //trappedWater = waterLevel - height[i];
            trappedWater +=waterLevel - height[i];
        }

        System.out.print(trappedWater);

    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        trappingRainWater(height);
    }
}