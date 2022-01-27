// const findLongestWord = (str) => {
// 	let longest = 0;
// 	let longArr = [];

// 	let splitStr = str.split(' ');

// 	for (let i = 0; i < splitStr.length; i++) {
// 		if (splitStr[i].length > longest) {
// 			longest = splitStr[i].length;
// 			longArr.push(splitStr[i]);
// 		}
// 	}
// 	return longArr.pop();
// };

const findLongestWord = (str) => {
	let splitStr = str.split(' ');
	let longest = splitStr.sort((a, b) => {
		return b.length - a.length;
	});

	return longest[0];
};

console.log(findLongestWord('gopal is the most powerful.'));
