
const str2 = "Durvesh";
const str1 = "Kumar";
// Output: DKuurmvaersh

let min = Math.min(str1.length, str2.length);

console.log(min);


function mergeStrings1(str1, str2) {
    let newString = "";
    for (let i = 0; i < min; i++) {
        newString += str1[i] + str2[i];
    }
    return newString + str1.slice(min) + str2.slice(min);
    
}
// console.log(mergeStrings1(str1, str2));

function mergeStrings2(s1, s2){
    let i = 0, j = 0;
    let result = "";
    while(i < s1.length && j < s2.length){
        result += s1[i];
        result += s2[j];
        i++;
        j++;
    }
    while(i < s1.length){
        result += s1[i];
        i++;
    }
    while(j < s2.length){
        result += s2[j];
        j++;
    }
    return result;
}

console.log(mergeStrings2(str1, str2));
