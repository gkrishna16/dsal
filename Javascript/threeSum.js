function threeSum(nums) {
  nums.sort((a, b) => a - b);
  let res = [];
  for (let i = 0; i < nums.length; i++) {
    if (i > 0 && nums[i] === nums[i - 1]) {
      continue;
    }
    let left = i + 1;
    let right = nums.length - 1;

    while (left < right) {
      let currSum = nums[i] + nums[left] + nums[right];
      if (currSum < 0) {
        left++;
      } else if (currSum > 0) {
        right--;
      } else {
        res.push([nums[i], nums[left], nums[right]]);
        left++;
        right--;
        while (left < right && nums[left] === nums[left - 1]) {
          left++;
        }
        while (left < right && nums[right] === nums[right + 1]) {
          right--;
        }
      }
    }
  }
  return res;
}

let arr = [-1, 0, 1, 2, -1, -4];
let val = threeSum(arr);
console.log(val);
