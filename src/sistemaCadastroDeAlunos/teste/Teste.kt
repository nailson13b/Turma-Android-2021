package sistemaCadastroDeAlunos.teste

import sistemaCadastroDeAlunos.*

fun main(){
    val professor = Professor("Cesar Rodrigues", "1234")
    val materiaKotlin = Materia("Aula de Kotlin")
    val aulaKotlin = Aula(materiaKotlin,"19:30", "21:45")

    val materiaAndroid = Materia("Aula de Android")
    val aulaAndroid = Aula(materiaKotlin,"19:30", "21:45")

    val luci = Aluno("Luci", "Costa", "123")
    val gabi = Aluno("Gabi", "Silva", "245")

    var curso = Curso(
        "Curso Android",
        listOf(aulaKotlin, aulaAndroid),
        listOf(luci,gabi),
        professor
    )

    val turma1 = Turma(
        "Turma 1 de android",
        curso
    )

    turma1.curso.listaAlunos.forEach{
        println("O nome do aluno é ${it.nome} ${it.sobrenome} e o registro " +
            "acadêmico é ${it.ra}")
    }
    println(turma1.curso.listaAlunos)
}