/*
Objective
Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops.
Check out the Tutorial tab for learning materials and an instructional video!

Task
Given a string, S, of length N that is indexed from 0 to N - 1, print its even-indexed and odd-indexed characters
as 2 space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

Input Format

The first line contains an integer, T (the number of test cases).
Each line i of the T subsequent lines contain a String, S.

Constraints
- 1 <= T <= 10
- 2 <= length of S <= 10000

Output Format

For each String S(sub)j (where 0 <= j <= T - 1), print S(sub)j's even-indexed characters,
followed by a space, followed by S(sub)j's odd-indexed characters.

Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak
Explanation

Test Case 0:
The even indices are , , and , and the odd indices are , , and . We then print a single line of  space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().

Test Case 1:
The even indices are  and , and the odd indices are  and . We then print a single line of  space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().
*/

// Solution to Day 6 is below. Review the code and gain a better understanding of what objectives are being done by which initiators.

function processData(input) {
    //Enter your code here
    let sString = input.split('\n'), evens, odds;
    sString.forEach((z) => {
        evens = ''; odds = '';
        if(!isNaN(z)) return;
        Array.from(z).forEach((lett, index) => {
            if(index === 0 || index % 2 === 0) {
                evens += lett;
            } else {
                odds += lett;
            }
        });
        console.log(evens + ' ' + odds);
    });
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});

// Dig deeper through this code. Line for line, understanding how this was formulated.
