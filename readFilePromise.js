const fs = require('fs');

module.exports = function resultPromise(filePath) {
	return new Promise((resolve, reject) => {
		return fs.readFile(filePath, { encoding: 'utf-8' }, (err, result) => {
			resolve(result);
		});
	});
};

// module.exports = function resultPromise(filePath) {
// 	return new Promise((resolve, result) => {
// 		fs.readFile(filePath, { encoding: 'utf-8' }, (err, result) => {
// 			resolve(result);
// 		});
// 	});
// };
