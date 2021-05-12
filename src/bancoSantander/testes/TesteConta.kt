package bancoSantander.testes

import bancoSantander.Cliente
import bancoSantander.Conta

fun main(){
    var conta = Conta(Cliente())
    println(conta.depositar(0.00, 27.36))
    println(conta.saldo())
    println(conta.sacar(30.00))
    println(conta.saldo())


}