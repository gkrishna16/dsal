class Solution {
  insertionSort(nums) {
    for (let i = 0; i < nums.length; i++) {
      let j = i;

      while (j > 0 && nums[j - 1] > nums[j]) {
        let temp = nums[j];
        nums[j] = nums[j - 1];
        nums[j - 1] = temp;
        j--;
      }
    }
    return nums;
  }
  fib(n) {
    if (n <= 1) {
      return n;
    }
    let F = 0;
    let F1 = 0,
      F2 = 1;
    let i = 2;
    while (i <= n) {
      F = F1 + F2;
      F1 = F2;
      F2 = F;
      console.log(i);
      i++;
    }
    return F;
  }
}
let sol = new Solution();
//console.log(sol.insertionSort([5, 4, 3, 2, 1]));
console.log(sol.fib(10));
