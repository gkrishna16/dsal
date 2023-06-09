var rotate = function (nums, k) {
  k %= nums.length;
  let a = (k %= nums.length);
  console.log(a);
  // reverse array
  reverse(nums, 0, nums.length - 1);
  // reverse k elements
  reverse(nums, 0, k - 1);
  // reverse last k elements
  reverse(nums, k, nums.length - 1);
  return nums;
};

let reverse = function (nums, start, end) {
  while (start < end) {
    let temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
    start++;
    end--;
  }
};

let val = rotate([1, 2, 3, 4, 5], 2);
console.log(val);
