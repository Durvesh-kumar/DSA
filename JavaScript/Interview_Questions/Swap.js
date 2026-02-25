let a = 2, b= 3;

// Swapping using destructuring assignment
[a, b] = [b, a];

// console.log(a, b); // Output: 3 2

// Swapping using a temporary variable
let temp = b;
b=a;
a=temp;
// console.log(a, b); // Output: 2 3

b=a+b;
a=b-a;
b=b-a;
console.log(a,b);

