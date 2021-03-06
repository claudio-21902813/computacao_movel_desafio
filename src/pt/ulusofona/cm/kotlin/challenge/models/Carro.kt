package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro(identificador:String, val motor : Motor): Ligavel, Veiculo(identificador) {

    var ligado : Boolean = false

    override fun ligar() {
        if(estaLigado()){
            throw VeiculoLigadoException("veiculo Ligado!")
        }
        ligado = true
    }

    override fun desligar() {
        if(!estaLigado()){
            throw VeiculoDesligadoException("Veiculo Desligado!")
        }
        ligado = false
    }

    override fun estaLigado(): Boolean {
        return ligado == true
    }

    fun mesmaPosicao(x: Int,y: Int) : Boolean{
        return (x == posicao.x) && (y == posicao.y)
    }


    override fun moverPara(x: Int, y: Int) {
        if(mesmaPosicao(x, y)){
            throw AlterarPosicaoException("Erro : Nao pode mover para mesma posicao")
        }
        posicao.alterarPosicaoPara(x, y)
        desligar()
    }

    override fun requerCarta(): Boolean {
        return true
    }

    override fun toString(): String {
        return  "Carro | " +
                "$identificador | " +
                "${Data(dataDeAquisicao).converte()} | " +
                "${posicao}"
    }
}