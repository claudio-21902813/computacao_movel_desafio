package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

class Veiculo(val identificador:String): Movimentavel, Ligavel {

    private val posicao : Posicao;
    private val dataDeAquisicao : Date;

    init {
        posicao = Posicao(0,0)
        dataDeAquisicao = Date()
    }

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