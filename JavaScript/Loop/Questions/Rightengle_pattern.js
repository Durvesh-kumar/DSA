for(let line = 1; line <=4; line++){
    let star1 = ""
    for(let star = 1; star<=4; star++){
        star1 +="* "
    }
    console.log(star1);
}

let count = 1;

for(let line = 1; line <=5; line++){
    let star1 = ""
    for(let star = 1; star<=3; star++){
        star1 +=`${count++}${" "}`
    }
    console.log(star1);
}