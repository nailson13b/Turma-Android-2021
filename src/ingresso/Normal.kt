package ingresso

class Normal() :Ingresso() {

    override val valor: Double = 10.00

    override fun imprimeValor(): String {
        return "O valor do seu ingresso normal é de R$$valor."

    }
}