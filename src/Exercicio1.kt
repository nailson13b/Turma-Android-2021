fun main () {
    var elon = Cliente("Elon", "Musk")
    var bill = Cliente("Bill", "Gates")

    var conta1 = Conta(123, 20.03, elon)
    var conta2 = Conta(234, 10.50, bill)

    conta1.deposito(5.00)
    conta2.saque(9.00)
}
    class Cliente(
        val nome: String,
        val sobrenome: String

    ) {

    }

    class Conta(
        val numeroDaConta: Int,
        var saldo: Double,
        val titular: Cliente
    ) {

        fun deposito(valorDeposito: Double) {
            saldo += valorDeposito
            println("Depósito realizado com sucesso. Seu novo saldo é $saldo.")
        }

        fun saque(valorSaque: Double) {
            if( saldo < valorSaque){
                println("Saldo insuficiente.")
            }else {
                saldo -= valorSaque
                println("Saque realizado com sucesso. Seu novo saldo é $saldo.")
            }
        }

    }



