var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

num = parseInt(lines[0])

let index = 0

while (index < 1000){
    for (let i = 0; i < num; i++) {
        if (index >= 1000) break
        console.log(`N[${index}] = ${i}`)
        index++
    }
}
