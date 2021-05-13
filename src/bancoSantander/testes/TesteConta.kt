package bancoSantander.testes

import bancoSantander.Cliente
import bancoSantander.Conta

fun main() {
    var conta = Conta("555", "Silva", "234567890", "99988877766")

    println(conta)
    println(conta.depositar(0.00, 27.36))
    println(conta.saldo())
    println(conta.sacar(30.00))
    println(conta.saldo())
}


