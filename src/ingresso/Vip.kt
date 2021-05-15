package ingresso

open class Vip():Ingresso() {

    var valorAdicional: Double = 5.00

    override val valor: Double = 10.00

    override fun imprimeValor(): String {
        var ingressoVip = valor + valorAdicional
        return "Após adicionar R$$valorAdicional seu ingresso passou a ser Vip pelo total de R$$ingressoVip."
    }
}