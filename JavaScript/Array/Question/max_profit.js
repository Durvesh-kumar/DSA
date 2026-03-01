let prices = [7, 1, 5, 3, 6,  4];

function maxPrice(prices){
    let maxProfit = 0, buy= +Infinity;
    for(let i=0; i<prices.length; i++){
        if(buy< prices[i]){
            let profit = prices[i] - buy;
            maxProfit = Math.max(maxProfit, profit);
            
        }else{
            buy = prices[i];
        }
    }
    return maxProfit;
}

console.log(maxPrice(prices));



/*
Given an integer array nums, return all the triplets [nums[i], nums[j],
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice 
that the solution set must not contain duplicate triplets.Example 1:Input:nums = [-1, 0,  1, 2, -1, -4]
   Output:   [ [-1, -1, 2] , [-1, 0, 1] ]
*/

function triplets(arr) {
    let result = []
    for(let i=0; i<arr.length; i++){
        for(let j=i+1; j<arr.length; j++){
            for(let k=i+1; k<arr.length; k++){
                if(arr[i]+arr[j]+arr[k]===0){
                   result.push([arr[i],arr[j], arr[k]]);
                }
            }
        }
    }
    return result;
}

console.log(triplets([-1, 0,  1, 2, -1, -4]));
