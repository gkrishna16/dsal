// function topKFrequentElements(nums, k) {
//   let store = {};

//   for (let num of nums) {
//     if (!store[num]) store[num] = 0;
//     store[num]++;
//   }

//   return [...Object.keys(store)]
//     .sort((a, b) => store[b] - store[a])
//     .slice(0, k);
// }

function topKFrequentElements(nums, k) {
  if (nums.length <= 1) {
    return nums;
  }

  let res = {};

  for (let i = 0; i < nums.length; i++) {
    if (!res[nums[i]]) res[nums[i]] = 0;
    res[nums[i]]++;
  }

  console.log(res);

  // console.log(Object.enteries(res));

  return Object.keys(res)
    .sort((a, b) => res[b] - res[a])
    .slice(0, k);
}

let val = topKFrequentElements([1, 1, 1, 2, 2, 3], 2);
console.log(val);
