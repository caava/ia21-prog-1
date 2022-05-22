import * as readline from 'readline'
import { stdin as input, stdout as output } from 'process'
const rl = readline.createInterface({ input, output })
const question = q => new Promise((rs, rj) => rl.question(q + ' ', a => rs(a)))

let soma = 0
let count = 0
let media = 0
let nota

while (true) {
    let strNota = await question(`Digite o valor da ${count + 1}° nota ou N/n para cacular a média entre os valores inseridos:`)

    if (strNota.toUpperCase() == 'N') {
        break
    }

    nota = parseFloat(strNota)

    if (isNaN(nota)) {
        console.log("Por favor digite um numero")
        continue
    }

    if (nota < 0 || nota > 10) {
        console.log("Por favor digite um numero de 0 a 10")
        continue
    }
    
    soma = soma + nota
    count++
}

media = soma / count

if (count == 0) {
    console.log("Sem valores válidos")
} else {
    console.log(`[ RESULTADO ] A média de todos os valores informados é`, media)
}

process.exit()
