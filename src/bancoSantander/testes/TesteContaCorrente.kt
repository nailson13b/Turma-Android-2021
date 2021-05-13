package bancoSantander.testes

import bancoSantander.Cliente
import bancoSantander.ContaCorrente

fun main(){
    var corrente = ContaCorrente("555", "Silva", "234567890", "99988877766")

    println(corrente)
    println(corrente.depositarCheque(50.00, "Caixa", "12/05/2021"))
    println(corrente.saldo)
}