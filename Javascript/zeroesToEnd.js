function zeroesToEnd(nums) {
  let k = 0;
  let n = nums.length;

  while (k < n) {
    if (nums[k] === 0) {
      break;
    } else {
      k++;
    }
  }
  let i = k,
    j = k + 1;

  //while (i < n && j < n) {}

  console.log(i, j);
  console.log(k);
}

let val = zeroesToEnd([1, 2, 0, 1, 0, 5]);
