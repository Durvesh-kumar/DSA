

function trappingWater(height) {
  let n = height.length;
  // Calculate left max boundary for each element in the array
  let left_max = new Array(n);
  left_max[0] = height[0];

  for (let i = 1; i < n; i++) {
    left_max[i] = Math.max(height[i], left_max[i-1]);
    // if (height[i] > left_max[i]) {
    //   left_max[i] = height[i];
    // }
  }

  // Calculate right max boundary for each element in the arrayd
  let right_max = new Array(n);
  right_max[n-1] = height[n - 1];

  for (let i = n - 2; i >= 0; i--) {
    right_max[i] = Math.max(height[i], right_max[i+1]);
  }

  // trapped water
  let trappedWater = 0;
  for (let i = 0; i < n; i++) {
    let waterlevel = Math.min(left_max[i], right_max[i]);

    // trapped_water = waterlevel - hight;

    trappedWater += waterlevel - height[i];
  }
  return trappedWater;
}

console.log(trappingWater([1,8,6,2,5,4,8,3,7]));

