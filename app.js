// function factorialize(num) {
// if (num === 0 || num === 1) return 1;
// 	for (var i = num - 1; i >= 1; i--) {
// 		num *= i;
// 	}
// 	return num;
// }

// function factorialize(num) {
// 	if (num === 0 || num === 1) {
// 		return num;
// 	}
// 	for (let i = num - 1; i >= 1; i--) {
// 		num = num * i;
// 	}

// 	return num;
// }

// let result = factorialize(1);
// console.log(result);

// const fs = require('fs');

// const filePromise = require('./readFilePromise');

// const inPromise = filePromise('index.html');

// if (true) {
// 	inPromise.then((result) => {
// 		try {
// 			console.log(result);
// 		} catch (error) {
// 			console.log(error);
// 		}
// 	});
// }

// const printResults = (err, result) => {
// 	console.log(result);
// };

// fs.readFile(
// 	'index.html',
// 	{
// 		encoding: 'utf-8',
// 	},
// 	(err, result) => {
// 		console.log(result);
// 	},
// );

// const fs = require('fs');

// const readfilePromise = require('./readFilePromise');

// const readFileResult = readfilePromise('random.txt');

// if (true) {
// 	console.log(readFileResult.then((result) => console.log(result));
// }

// const printResults = (err, result) => {
// 	// console.log(err);
// 	console.log(`the function called.`);
// 	console.log(result);
// };

// fs.readFile('random.txt', { encoding: 'utf-8' }, printResults);

// const myName = 'Gopal';

// // console.log(myName.split('').reverse().join(''));
// console.log(myName.charAt(0).toLowerCase() + myName.split());

let a = ['x', 'y', 'z'];

let b = ['a', 'b', 'c', ...a, '1'];

console.log(b);
