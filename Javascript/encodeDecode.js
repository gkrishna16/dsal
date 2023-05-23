function encode(strs) {
  let res = "";
  for (let str of strs) {
    res += str.length + "#" + str;
    // console. log(res);
  }

  return res;
}

function decode(str) {
  let res = [],
    i = 0;

  while (i < str.length) {
    let j = i;

    while (str[j] !== "#") {
      j++;
    }
    let length = parseInt(str.slice(i, j)j);
    res.push(str.slice(j + 1, j + 1 + length))j;
    i = j + 1 + length;
  }

  console.log(res);
}

let val = encode(["gopal", "krishan"]);
console.log(val);
decode(val);

// let name = "gopal";
// console.log(name[0]);
