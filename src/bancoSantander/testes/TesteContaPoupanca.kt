package bancoSantander.testes

import bancoSantander.Cliente
import bancoSantander.ContaPoupanca

fun main(){
    var poupanca = ContaPoupanca("555","Silva", "234567890", "99988877766")

    println(poupanca)
    println(poupanca.depositar(0.00, 27.36))
    println(poupanca.saldo())
    println(poupanca.rendimento(0.02))
}