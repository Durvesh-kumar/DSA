/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/

function twoSum1(nums, target) {
    for(let i=0; i<nums.length; i++){
        for(let j=i+1; j<nums.length; j++){
            if(nums[i]+nums[j]===target){
               return [i,j];
            }
        }
    }
}

console.log(twoSum1([2,7,11,15],9));
console.log(twoSum1([3,2,4], 6));
console.log(twoSum1([3,3], 6));

/*

Time complexity ----> O(n^2);
Space complexity ----> O(1)
*/

function twoSum2(nums, target){
    //This will store numbers you’ve already seen as keys, and their indices as values.
    // यहाँ हम एक object बना रहे हैं जिसमें पहले देखे गए नंबर और उनका index स्टोर करेंगे।
   let map ={}; // Store number --> index
   for(let i=0; i<nums.length; i++){
    // Complement वह नंबर है जो current नंबर के साथ मिलकर target बनाएगा।
    // उदाहरण: अगर target = 9 और current नंबर 7 है तो complement = 2 होगा।
    let complement = target - nums[i];

    // अगर complement पहले से map में मौजूद है, तो इसका मतलब हमें pair मिल गया।
    // हम तुरंत indices return कर देंगे।
    if(map.hasOwnProperty(complement)){
        return [map[complement], i];
    }
    // अगर complement नहीं मिला, तो current नंबर और उसका index future के लिए store कर देंगे।
    map[nums[i]] = i;
   }
   
}

console.log(twoSum2([2,7,11,15],9));
console.log(twoSum2([3,2,4], 6));
console.log(twoSum2([3,3], 6));

/*

Time complexity ----> O(n);
Space complexity ----> O(n)
*/


