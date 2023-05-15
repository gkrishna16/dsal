"use strict";
function fibonaci(n) {
    if (n <= 1) {
        return 1;
    }
    return fibonaci(n - 1) + fibonaci(n - 2);
}
const val = fibonaci(4);
console.log(val);
