package bancoSantander

class ContaPoupanca(cliente: Cliente):Conta(cliente){
    var taxaDeJuros: Double = 0.00
    var rendimento: Double = 0.00

    open fun rendimento(taxaDeJuros:Double): String {
       rendimento = saldo * taxaDeJuros
        this.saldo = this.saldo + rendimento
        return "Seu rendimento foi de R$$rendimento."
    }
}