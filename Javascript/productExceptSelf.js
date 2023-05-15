function productExceptSelf(nums) {
  let answer = [];
  answer[0] = 1;
  // answer array populated
  for (let i = 1; i < nums.length; i++) {
    answer[i] = nums[i - 1] * answer[i - 1];
  }
  // console.log(answer);
  // create right side of array and multiply right and left both to update the final array
  let leftPrefix = 1;
  for (let j = nums.length - 1; j >= 0; j--) {
    answer[j] *= leftPrefix;
    // console.log(answer);
    leftPrefix *= nums[j];
  }

  return answer;
}

let val = productExceptSelf([1, 2, 3, 4]);
console.log(val);
