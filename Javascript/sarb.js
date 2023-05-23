// const Occurance = (arr) => {
//   const result = {};
//   arr.map((i, index) => {
//     //let count = 1;
//     // for (let x = 0; x < arr.length; x++) {
//     //   if (arr[x] === i) {
//     //     count++;
//     //   }
//     // }

//     if (result[i]) {
//       result[i]++;
//     } else {
//       result[i] = 1;
//     }
//   });

//   return result;
// };

// console.log(Occurance([10, 10, 20, 25, 25, 1, 1, 1, 1, 1, 0]));

const revArray = (arr) => {
  for (let x = 0; x < Math.floor(arr.length / 2); x++) {
    let swapValue = arr[x];
    arr[x] = arr[arr.length - 1 - x];
    arr[arr.length - 1 - x] = swapValue;
  }

  return arr;
};

console.log(revArray([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]));
