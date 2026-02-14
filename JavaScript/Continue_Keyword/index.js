const prompt = require("prompt-sync")();

const n = prompt("Please enter number between 1 to 10 then i skip this number: ");

for (let i = 0; i < 10; i++) {
    if(i === n)continue;
    console.log(i);
}