package sistemaCadastroDeAlunos

class Curso(
    var nome: String = "curso",
    var listaAulas: List<Aula>,
    var listaAlunos: List<Aluno>,
    var professor: Professor

){
}