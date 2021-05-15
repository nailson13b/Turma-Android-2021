package ingresso

class CamaroteSuperior(

    var camaroteValor: Double = 15.00

): Vip() {
    var localizacaoIngresso: String = "Camarote Superior"
    override fun imprimeValor(): String {
        return "O valor para acessar o camarote é de R$$camaroteValor."
    }

}