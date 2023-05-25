class Solution {
  twoSum2(nums, target) {
    let left = 0,
      right = nums.length - 1;

    while (left < right) {
      let currSum = nums[left] + nums[right];

      if (currSum > target) {
        right--;
      } else if (currSum < target) {
        left++;
      } else {
        return [left + 1, right + 1];
      }
    }
    return [];
  }
}

let sol = new Solution();
console.log(sol.twoSum2([2, 3, 4, 54], 7));
