function productExceptSelf(nums) {
  const answer = [];
  let leftPrefix = 1;

  for (let i = 0; i < nums.length; i++) {
    answer[i] = leftPrefix;
    leftPrefix *= nums[i];
  }

  let rightPrefix = 1;
  for (let j = nums.length - 1; j >= 0; j--) {
    answer[j] *= rightPrefix;
    rightPrefix *= nums[j];
  }

  return answer;
}

let val = productExceptSelf([1, 2, 3, 4]);
console.log(val);
