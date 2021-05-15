package ingresso.testes

import ingresso.CamaroteInferior
import ingresso.CamaroteSuperior
import ingresso.Normal
import ingresso.Vip
import java.util.*

fun main(){
    var ingressoVip = Vip()
    var ingressoNormal = Normal()
    var camaroteSuperior = CamaroteSuperior()
    var camaroteInferior = CamaroteInferior()
    val reader = Scanner(System.`in`)

    println("Digite 1 para selecionar o ingresso NORMAL ou 2 para o ingresso VIP:")
    var r1: Int = reader.nextInt()

    if( r1 == 1){
        println(ingressoVip.imprimeValor())
        println("--------------------------------------------------------------------")
        println("Digite 1 para acessar o Camatore Superior ou digite 2 para acessar o Camarote Inferior: ")
        var r2: Int = reader.nextInt()
            if (r2 == 1){
                println(camaroteSuperior.localizacaoIngresso)
            }else{
                println(camaroteInferior.localizacaoIngresso)
            }
    }else{
        println(ingressoNormal.imprimeValor())
    }



}

