// let count = 0;
// function func() {
//   if (count == 3) {
//     return;
//   }
//   console.log(count);
//   count++;
//   func();
// }

// func();

// Two Sum
// let x = 0;

// function twoSum(arr, target) {
//   let result = {};

//   for (let i = 0; i < arr.length; i++) {
//     let diff = target - arr[i];
//     x++;
//     if (result[diff]) {
//       return [i, result[diff]];
//     }

//     result[arr[i]] = i;
//     console.log(result);
//   }
//   console.log(result);
//   return [-1];
// }

// function twoSum2(nums, target) {
//   for (let i = 0; i < nums.length - 1; i++) {
//     for (let j = i + 1; j < nums.length; j++) {
//       x++;
//       if (nums[i] + nums[j] === target) {
//         return [i, j];
//       }
//     }
//   }
//   return [-1];
// }

// let val = twoSum2([10, 20, 30, 40], 50);
// console.log(val, "ran" + x);

// function recur(n) {
//   if (n === 0) {
//     return;
//   }
//   console.log(n);
//   recur(n - 1);
// }

// let rc = recur(10);
//function recur(n) {
//   if (n === 0) {
//     return;
//   }
//   console.log(n);
//   recur(n - 1);
// }

// let rc = recur(10);

// function recur2(text) {
//   if (text.length == 0) {
//     return;
//   }

//   recur2(text.replace(text[text.length - 1], ""));

//   console.log(text);
// }

// recur2("sarb");

// function bubbleSort(nums) {
//   let flag = true;

//   for (let i = 0; i < nums.length; i++) {
//     if (nums[i] > nums[i + 1]) {
//       let temp = nums[i];
//       nums[i] = nums[i + 1];
//       nums[i + 1] = temp;
//       flag = false;
//     }
//   }

//   if (flag === false) {
//     bubbleSort(nums);
//   }

//   return nums;
// }

// let val = bubbleSort([5, 4, 3, 2, 1]);
// console.log(val);
// let arr = [`one`, `two`, `three`];
// console.log(arr.toString().split(" "));

let ob = { 1: `one `, 2: `two` };
console.log(ob);

let ob1 = Object.entries(ob);
console.log(ob1);