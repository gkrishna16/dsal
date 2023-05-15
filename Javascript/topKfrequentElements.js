function topKFrequentElements(nums, k) {
  let store = {};

  for (let num of nums) {
    if (!store[num]) store[num] = 0;
    store[num]++;
  }

  return [...Object.keys(store)]
    .sort((a, b) => store[b] - store[a])
    .slice(0, k);
}

let val = topKFrequentElements([1, 1, 1, 2, 2, 3], 2);
console.log(val);
