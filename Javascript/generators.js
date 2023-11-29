//function* helloWorld() {
//  yield "what up world !";
//  yield "what's up Gopal.";
//}

//let genObject = helloWorld();

//console.log(genObject.next());

//console.log(genObject.next());

//console.log(genObject.next());

function* abcs() {
  yield "A";
  yield "B";
  yield "C";
}

for (let letter of abcs()) {
  console.log(letter);
}

console.log([...abcs()]);
