fun main(){

}

class SaoPaulo(): RegraDeOuro{
    override fun colherEstadoXpto(): Double {
        TODO("Not yet implemented")
    }

    override fun colherEstadoXyz(): String {
        TODO("Not yet implemented")
    }

    override fun colherEstadoX() {
        TODO("Not yet implemented")
    }

}

interface RegraDeOuro{

    fun colherEstadoXpto(): Double

    fun colherEstadoXyz(): String

    fun colherEstadoX()
}

abstract class RegraDePrata {

    val icms = 7.0

    abstract fun colherEstadoXpto(): Double

    abstract fun colherEstadoXyz(): String

    abstract fun colherEstadoX()
}