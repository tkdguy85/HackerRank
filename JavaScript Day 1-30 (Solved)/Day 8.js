/*

Output Format

On a new line for each query, print Not found if the name has no corresponding entry
in the phone book; otherwise, print the full  and  in the format name=phoneNumber.

Sample Input

3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
Sample Output

sam=99912222
Not found
harry=12299933
Explanation

We add the following  (Key,Value) pairs to our map so it looks like this:


We then process each query and print key=value if the queried  is found in the
map; otherwise, we print Not found.

Query 0: sam
Sam is one of the keys in our dictionary, so we print sam=99912222.

Query 1: edward
Edward is not one of the keys in our dictionary, so we print Not found.

Query 2: harry
Harry is one of the keys in our dictionary, so we print harry=12299933.

*/

// _________________________________SOLUTION__________________________________________

function processData(input) {
    //Enter your code here
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

function processData(input) {
    input = input.split('\n')
    var x = parseInt(input[0])

    var phonebook = []
    for (var j = 0; j < x; j++) {
        var line = input[ j + 1 ]
        line = line.split(' ')
        phonebook[line[0]] = line[1]
    }

    for (var j = x + 1; j < input.length; j++) {
        var num = (phonebook[input[j]])
        if (num !== undefined){
            console.log(input[j] + '=' + num)
        } else {
            console.log('Not found')
        }
    }

}
