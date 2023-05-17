function validSudoku(board) {
  // let st = new Set();
  // for (let i = 0; i < 9; i++) {
  //   for (let j = 0; j < 9; j++) {
  //     let num = board[i][j];
  //     if (num === ".") {
  //       continue;
  //     }
  //     let boxNum = 3 * Math.floor(i / 3) + Math.floor(j / 3);
  //     let row = "the row has " + i;
  //     let col = "the col has " + j;
  //     let box = `box: ${boxNum}, value ${num}`;
  //     if (st.has(row) || st.has(col) || st.has(box)) {
  //       return false;
  //     }
  //     st.add(row);
  //     st.add(col);
  //     st.add(box);
  //   }
  // }

  // return true;

  const set = new Set();

  for (let i = 0; i < 9; i++) {
    for (let j = 0; j < 9; j++) {
      const num = board[i][j];
      if (num === ".") {
        continue;
      }
      const boxNum = 3 * Math.floor(i / 3) + Math.floor(j / 3);
      const row = `row: ${i}, value ${num}`;
      const col = `col: ${j}, value ${num}`;
      const box = `box: ${boxNum}, value ${num}`;
      // const boxNum = 3 * Math.floor(i / 3) + Math.floor(j / 3);
      // const row = "the row has " + i;
      // const col = "the col has " + j;
      // const box = `box: ${boxNum}, value ${num}`;
      if (set.has(row) || set.has(col) || set.has(box)) {
        return false;
      }
      set.add(row);
      set.add(col);
      set.add(box);
    }
  }

  return true;
}

let val = validSudoku([
  ["5", "3", ".", ".", "7", ".", ".", ".", "."],
  ["6", ".", ".", "1", "9", "5", ".", ".", "."],
  [".", "9", "8", ".", ".", ".", ".", "6", "."],
  ["8", ".", ".", ".", "6", ".", ".", ".", "3"],
  ["4", ".", ".", "8", ".", "3", ".", ".", "1"],
  ["7", ".", ".", ".", "2", ".", ".", ".", "6"],
  [".", "6", ".", ".", ".", ".", "2", "8", "."],
  [".", ".", ".", "4", "1", "9", ".", ".", "5"],
  [".", ".", ".", ".", "8", ".", ".", "7", "9"],
]);

console.log(val);

// let st = new Set();

// if (st.add(10)) {
//   console.log(100);
// }

// console.log(st.add(10));
