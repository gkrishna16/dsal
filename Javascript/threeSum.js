function threeSum(nums) {
  nums.sort((a, b) => a - b);
  let res = [];

  for (let i = 0; i < nums.length; i++) {
    let first = nums[i];

    if (first > 0) {
      break;
    }

    if (i > 0 && first === nums[i - 1]) {
      continue;
    }

    let l = i + 1,
      r = nums.length - 1;

    while (l < r) {
      let currSum = first + nums[l] + nums[r];

      if (currSum > 0) {
        r--;
      } else if (currSum < 0) {
        l++;
      } else {
        res.push([first, nums[l], nums[r]]);
        l++;
        r--;
        while (l < r && nums[l] === nums[l - 1]) {
          l++;
        }
        while (l < r && nums[r] === nums[r + 1]) {
          r--;
        }
      }
    }
  }

  return res;
}

let val = threeSum([-1, 0, 1, 2, -1, -4]);
console.log(val);
