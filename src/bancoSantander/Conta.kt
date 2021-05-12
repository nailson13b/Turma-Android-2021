package bancoSantander


open class Conta(function: Cliente) : Cliente(
) {
    var depositar: Double = 0.0
    var sacar: Double = 0.0
    var juros: Double = 0.0
    var saldo: Double = 0.0

    open fun depositar(saldo: Double, depositar:Double):String {
        this.saldo += depositar
        return "Você depositou R$$depositar."

    }

    open fun sacar( sacar: Double):String{
        if(sacar > saldo){
            return "Saldo insuficiente."
        }else {
            this.saldo -= sacar
        }
        return "Saque de $sacar realizado com sucesso."
    }

    open fun saldo():String{
        return "Seu saldo atual é de R$$saldo ."
    }

}
