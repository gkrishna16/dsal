// class Solution {
//   groupAnagrams(arr) {
//     let res = {};

//     for (let str of arr) {
//       // Everytime a new count is being created.
//       let count = new Array(26).fill(0);
//       console.log(count);

//       for (let i = 0; i < str.length; i++) {
//         count[str.charCodeAt(i) - 5] += 1;
//       }
//       console.log(count);
//       if (res[count]) {
//         res[count].push(str);
//       } else {
//         res[count] = [str];
//       }
//     }
//     return Object.values(res);
//   }
// }

// let sol = new Solution();
// let arr = ["eat", "tea", "tan", "ate", "nat", "bat"];
// let val = sol.groupAnagrams(arr);
// console.log(val);

let arr = [1, 2, 3, 4, 5];
let ar = arr.map((el, ind) => {
  console.log(el, ind);
});
