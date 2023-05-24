function longestSubStrng(nums) {
  let set = new Set(nums);
  let longest = 0;

  for (let num of nums) {
    if (set.has(num - 1) === false) {
      let length = 0;
      console.log(set.has(num - 1));

      while (set.has(num + length)) {
        length += 1;
      }
      longest = Math.max(length, longest);
    }
  }

  return longest;
}

let value = longestSubStrng([1, 2, 3, 4, 5, 69]);
console.log(value);
