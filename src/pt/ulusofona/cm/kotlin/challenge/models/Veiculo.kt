package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Veiculo(open val identificador:String):Movimentavel{
    var posicao : Posicao;
    var dataDeAquisicao : Date;

    init {
        posicao = Posicao(0,0)
        dataDeAquisicao = Date()
    }

    override fun moverPara(x: Int, y: Int) {
        if(x == posicao.x && y == posicao.y){
            throw AlterarPosicaoException("Erro : Nao pode mover para mesma posicao")
        }
        posicao.alterarPosicaoPara(x, y)
    }

    open fun requerCarta():Boolean{
        return false;
    }
}