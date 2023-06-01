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

let val = maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7]);
console.log(val);
