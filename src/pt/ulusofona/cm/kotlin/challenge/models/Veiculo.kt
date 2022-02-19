package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Veiculo(val identificador:String, val posicao:Posicao, dataDeAquisicao:Date): Movimentavel, Ligavel {
    fun requerCarta():Boolean{
        return false;
    }

    override fun moverPara(x: Int, y: Int) {
    }

    override fun ligar() {
    }

    override fun desligar() {
    }

    override fun estaLigado(): Boolean {
        return false
    }

    override fun toString(): String {
        return super.toString()
    }
}