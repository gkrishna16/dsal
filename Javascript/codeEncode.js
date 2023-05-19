function codeEncode(strs) {
  let result = "";
  for (let string of strs) {
    result += string.length.toString(2).padStart(8, "0") + string;
    console.log(result);
  }
}

function decode(s) {
  let result = [];

  for (let i = 0; i < s.length; i++) {}
}

codeEncode([`gopal`, "Krishan"]);
