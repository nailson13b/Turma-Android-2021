package bancoSantander.testes

import bancoSantander.Cliente
import bancoSantander.ContaPoupanca

fun main(){
    var poupanca = ContaPoupanca(Cliente())

    println(poupanca.depositar(0.00, 27.36))
    println(poupanca.saldo())
    println(poupanca.rendimento(0.02))
    println(poupanca.saldo())
}