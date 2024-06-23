var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

num = lines[0].trim()

for (let i = 0; i < 10; i++) {
    console.log(`N[${i}] = ${num}`)
    num*=2
}