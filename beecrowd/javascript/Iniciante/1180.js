var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let array = lines[1].split(" ")
array = array.map(Number)

let menor = array[0]
let posicao = 0

for(let i = 0; i < array.length; i++){
    if (array[i] < menor){
        menor = array[i]
        posicao = i
    }
}
console.log(`Menor valor: ${menor}`)
console.log(`Posicao: ${posicao}`)