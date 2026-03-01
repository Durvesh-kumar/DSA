/*
 Container With Most Water
Medium
Topics
premium lock icon
Companies
Hint
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
*/


function maxArea(height){
    const n = height.length;

    let left =0, right=n-1;
    let maxArea = 0;
    while (left < right) {
        // Width = दोनों pointers के बीच की दूरी।
        // Height = दोनों में से छोटा bar (क्योंकि पानी छोटा bar तक ही भर सकता है)।
        // Area = height × width.
        let weight = right-left;
        let area = Math.min(height[left], height[right]) * weight;
        maxArea = Math.max(maxArea, area);

        // छोटा bar हटाकर pointer को अंदर की ओर बढ़ाते हैं।
        // ऐसा इसलिए क्योंकि बड़ा bar रहने से area बढ़ने की संभावना रहती है।
        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
    }
    return maxArea;
}

console.log(maxArea([1,8,6,2,5,4,8,3,7]));