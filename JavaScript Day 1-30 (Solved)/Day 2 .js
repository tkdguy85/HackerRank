'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the solve function below.
function solve(meal_cost, tip_percent, tax_percent) {
    //var meal_cost = readLine() ;
    //var tip_percent = readLine() / 100;
    //var tax_percent = readLine() / 100;
}

function main() {
    const meal_cost = parseFloat(readLine(), 1.00);

    const tip_percent = parseInt(readLine(), 10);

    const tax_percent = parseInt(readLine(), 10);

    solve(meal_cost, tip_percent, tax_percent);
    var x = Math.round(meal_cost) // Round was a pain in the ass. Figured it out.
    //console.log(x)
    var y = tip_percent /10
    //console.log(y)
    var z = tax_percent /10
    //console.log(z)
    var check = x + y + z
    console.log(Math.ceil(check)) //.ceil made this function work in the end
}
