package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Veiculo(open val identificador:String):Movimentavel{
    var posicao : Posicao;
    var dataDeAquisicao : Date;

    init {
        posicao = Posicao(0,0)
        dataDeAquisicao = Date()
    }

     abstract override fun moverPara(x: Int, y: Int)

     abstract fun requerCarta():Boolean
}