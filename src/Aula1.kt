fun main(){

    //val - imutavel - nao consigo alterar
    //var - mutavel - consigo alterar
    val inteiro: Int = 1
    val inteiro2 = 2
    val numeroUltraGrande: Long = 3465465456456456456
    val texto = "Cesar"
    val ehMaior = true
    val decimalMenor: Float = 2.5f
    val decimalMenor2 = 2.5f
    val decimalMaior = 2.24557445774545

    println(true && false)

    val pets = listOf("Cachorro", "Gato", "Tartaruga", "Ramster")
    val petsMutavel = mutableListOf("Cachorro", "Gato", "Tartaruga", "Peixe")
    petsMutavel.add("Ramster")
    println(petsMutavel)

    val numero = 3

    if (numero < 3){
        println("")
    }

    when{
        numero < 3 -> println("Menor que 3")
        numero > 3 -> println("Maior que 3")
        else -> println("Caiu no else")
    }

    for (num in 1..10 step 2){
        println(num)
    }

    petsMutavel.forEach {
        println(it)
    }

    var x = 0
    while (x < 2) {
        println(x)
        x++
    }
}