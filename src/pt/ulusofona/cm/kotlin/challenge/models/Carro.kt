package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro(val identificador:String,val motor : Motor): Ligavel, Movimentavel {
    override fun ligar() {
        TODO("Not yet implemented")
    }

    override fun desligar() {
        TODO("Not yet implemented")
    }

    override fun estaLigado(): Boolean {
        TODO("Not yet implemented")
    }

    override fun moverPara(x: Int, y: Int) {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return super.toString()
    }
}