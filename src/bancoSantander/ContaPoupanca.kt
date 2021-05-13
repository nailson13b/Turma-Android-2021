package bancoSantander

open class ContaPoupanca(
    override var numero: String,
    override var sobrenome: String,
    override var rg: String,
    override var cpf: String,
):Conta(
    numero,
    sobrenome,
    rg,
    cpf
){
    var rendimento: Double = 0.00

    open fun rendimento(taxaDeJuros:Double): String {
       rendimento = saldo * taxaDeJuros
        this.saldo = this.saldo + rendimento
        return "Seu rendimento foi de R$$rendimento, assim totalizando R$$saldo."
    }
}