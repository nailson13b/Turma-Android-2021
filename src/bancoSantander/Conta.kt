package bancoSantander


open class Conta(
    override var numero: String,
    override var sobrenome: String,
    override var rg: String,
    override var cpf: String,

) : Cliente(
    numero,
    sobrenome,
    rg,
    cpf
) {
    var saldo: Double = 0.0

    open fun depositar(
        saldo: Double,
        depositar:Double
    ):String {
        this.saldo += depositar
        return "Você depositou R$$depositar e seu saldo atual é de R$${this.saldo}."

    }

    open fun sacar(
        sacar: Double
    ):String{
        return if(sacar > saldo){
            "Saldo insuficiente. Você tentou sacar R$$sacar, porém seu saldo atual é de R$${this.saldo}."
        }else {
            this.saldo -= sacar
            "Saque de $sacar realizado com sucesso."
        }
    }

    open fun saldo():String{
        return "Seu saldo atual é de R$$saldo ."
    }

    override fun toString(): String = """
        Numero: $numero
        Sobrenome: $sobrenome
        Rg: $rg
        Cpf: $cpf
    """.trimIndent()
}
