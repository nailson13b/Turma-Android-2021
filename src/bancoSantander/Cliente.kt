package bancoSantander

open class Cliente(
    var numero: String = "151",
    val sobrenome: String = "Oliveira",
    val rg: String = "123456789",
    val cpf: String = "33355566699"
) {
    override fun toString(): String = """
        Numero: $numero
        Sobrenome: $sobrenome
        Rg: $rg
        Cpf: $cpf
    """.trimIndent()
}
