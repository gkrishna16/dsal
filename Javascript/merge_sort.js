function mergeSort(arr) {
  if (arr.length <= 1) {
    return;
  }
  let leftArray = arr.slice(0, Math.floor(arr.length / 2));
  let rightArray = arr.slice(Math.floor(arr.length / 2));

  mergeSort(leftArray);
  mergeSort(rightArray);

  // sorting
  let i = 0;
  let j = 0;
  let k = 0;
  while (i < leftArray.length && j < rightArray.length) {
    if (leftArray[i] < rightArray[j]) {
      arr[k] = leftArray[i];
      i++;
    } else {
      arr[k] = rightArray[j];
      j++;
    }
    k++;
  }

  while (i < leftArray.length) {
    arr[k] = leftArray[i];
    i++;
    k++;
  }
  while (j < rightArray.length) {
    arr[k] = rightArray[j];
    j++;
    k++;
  }

  return arr;
}

let val = mergeSort([5, 4, 3, 3, 23, 1, 5]);
console.log(val);

// The instagram friend on the porch
