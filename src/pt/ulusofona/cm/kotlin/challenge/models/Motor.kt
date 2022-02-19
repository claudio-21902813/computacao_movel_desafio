package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Motor(val cavalos:Int,val cilindrada:Int): Ligavel {

    private val ligado : Boolean

    init {
        ligado = false
    }

    override fun ligar() {
    }

    override fun desligar() {
    }

    override fun estaLigado(): Boolean {
        return false
    }
}