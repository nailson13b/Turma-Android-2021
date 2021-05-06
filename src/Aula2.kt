fun main(){
    val fred = Animal("Fred", "Cachorro")
    val bichano = Animal("Bichano", "gato", "mamifero")
    val perebas = Animal("Perebas", "rato", 15)
    fred.comer()
    fred.sobre()

}

class Animal(
    val nome: String,
    val tipo: String
) {
    constructor(nome: String, tipo: String, reino: String): this(nome, tipo)
    constructor(nome: String, tipo: String, tamanho: Int): this(nome, tipo)

    val nomeETipo = "$nome - $tipo"

    val teste1 = "Execucao 1"

    init{
        println(teste1)
    }

    val teste2 = "Execucao 2"

    init {
        println(teste2)
    }

    fun sobre(){
        println(nomeETipo)
    }

    fun comer() {

    }
}

