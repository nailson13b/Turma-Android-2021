package bancoSantander.testes

import bancoSantander.Cliente
import bancoSantander.ContaCorrente
import bancoSantander.ContaPoupanca

fun main(){
    var corrente = ContaCorrente("111","Musk","123456789","55544488899")


    println(corrente)
    println(corrente.depositarCheque(50.00, "Caixa", "12/05/2021"))
    println(corrente.sacar(50.50))
println("-----------------------------------------------------------")

    var poupanca = ContaPoupanca("222","Gates", "234567890", "99988877766")
    println(poupanca)
    println(poupanca.depositar(0.00, 27.36))
    println(poupanca.saldo())
    println(poupanca.rendimento(0.02))
    println(poupanca.sacar(13.36))
}