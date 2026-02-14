const prompt = require("prompt-sync")();

for (let i = 0; i <= 10; i++) {
    if(i == 4) {
        console.log(i);
        break;
    }
    console.log("For loop is stop");
}

function main() { 
do{
    const n = prompt("Please enter your number: ")

    if(n%10 === 0){
        break;
    }
    console.log(n);
    
} while(true)
} 
main();