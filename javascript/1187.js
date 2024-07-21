var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let soma = 0
let cont = 0
let operacao = lines[0]
contLines = 1

for(let i = 0; i< 12; i++) {
    for(let j = 0; j < 12; j++) {
        num = parseFloat(lines[contLines])
        contLines++;
        if (isNaN(num)) {
            console.log(num);
        }
        if(j>i && i+j <= 10){
            soma += num
            cont++
        }
    }
}

if (operacao == 'S'){
    console.log(soma.toFixed(1))
}else{
    let media = soma/cont
    console.log(media.toFixed(1))
}