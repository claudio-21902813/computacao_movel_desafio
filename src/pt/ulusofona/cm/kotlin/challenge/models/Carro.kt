package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro(identificador:String,val motor : Motor): Ligavel, Movimentavel, Veiculo(identificador) {

    override fun ligar() {
        motor.ligado = true
    }

    override fun desligar() {
        motor.ligado = false
    }

    override fun estaLigado(): Boolean {
        return motor.ligado
    }

    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x,y)
    }

    override fun toString(): String {
        return  "Carro |" +
                "$identificador" +
                "$dataDeAquisicao" +
                "Posicao" +
                "${posicao}"
    }
}