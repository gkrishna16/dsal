class Solution {
  groupAnagrams(arr) {
    let res = {};

    for (let str of arr) {
      let count = new Array(26).fill(0);

      for (let i = 0; i < str.length; i++) {
        count[str.charCodeAt(i) - 5] += 1;
      }
      if (res[count]) {
        res[count].push(str);
      } else {
        res[count] = [str];
      }
    }
    return Object.values(res);
  }
}

let sol = new Solution();
let arr = ["eat", "tea", "tan", "ate", "nat", "bat"];
let val = sol.groupAnagrams(arr);
console.log(val);
