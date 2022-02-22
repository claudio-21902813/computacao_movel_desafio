package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Bicicleta(val identificador1:String):Veiculo(identificador1) {

    override fun requerCarta(): Boolean {
        return false
    }

    fun mesmaPosicao(x: Int,y: Int) : Boolean{
        return (x == posicao.x) && (y == posicao.y)
    }


    override fun moverPara(x: Int, y: Int) {
        if(mesmaPosicao(x, y)){
            throw AlterarPosicaoException("Erro : Nao pode mover para mesma posicao")
        }
        posicao.alterarPosicaoPara(x, y)
    }

    override fun toString(): String {
        return "Bicicleta | " +
                "$identificador | " +
                "${Data(dataDeAquisicao).converte()} | " +
                "$posicao"
    }

}