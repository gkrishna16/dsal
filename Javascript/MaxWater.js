var maxArea = function (height) {
  let res = 0;
  for (let i = 0; i < height.length; i++) {
    for (let j = i + 1; j < height.length; j++) {
      let area = (j - i) * Math.min(height[j], height[i]);
      res = Math.max(area, res);
    }
  }

  return res;
};

function maxArea2(height) {
  let res = 0;
  let left = 0;
  let right = height.length - 1;
  while (left < right) {
    let area = (right - left) * Math.min(height[left], height[right]);
    res = Math.max(res, area);
    if (height[left] < height[right]) {
      left++;
    } else {
      right--;
    }
  }
  return res;
}

console.table([1, 2, 3, 4, 5, 6]);
let val = maxArea2([1, 8, 6, 2, 5, 4, 8, 3, 7]);
console.log(val);
