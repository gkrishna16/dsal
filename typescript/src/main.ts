function threeSum(nums: number[]): number[][] {
  nums.sort();
  let res: number[][] = [];
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] > 0) {
      break;
    }
    if (i > 0 && nums[i] === nums[i - 1]) {
      continue;
    }
    let l: number = i + 1;
    let r: number = nums.length - 1;
    while (l < r) {
      let threeSum = nums[i] + nums[l] + nums[r];
      if (threeSum > 0) {
        r--;
      } else if (threeSum < 0) {
        l++;
      } else {
        res.push([nums[i], nums[l], nums[r]]);
        l++;
        r--;
        while (nums[l] === nums[l - 1] && l < r) {
          l++;
        }
        while (nums[r] === nums[r + 1] && l < r) {
          r--;
        }
      }
    }
  }
  return res;
}

let val = threeSum([-1, 0, 1, 2, -1, -4]);
console.log(val);
