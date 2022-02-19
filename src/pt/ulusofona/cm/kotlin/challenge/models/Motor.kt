package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Motor(val cavalos:Int,val cilindrada:Int,val ligado:Boolean): Ligavel {
    override fun ligar() {
    }

    override fun desligar() {
    }

    override fun estaLigado(): Boolean {
        return false
    }
}