package sistemaCadastroDeAlunos

open class Aluno(
    override var nome: String,
    var sobrenome: String,
    var ra: String
):Pessoa(nome){

    fun assistirAula(){

    }

    fun fazerLicao(){

    }

}