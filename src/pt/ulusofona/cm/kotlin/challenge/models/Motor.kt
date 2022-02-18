package pt.ulusofona.cm.kotlin.challenge.models

class Motor(val cavalos:Int,val cilindrada:Int,val ligado:Boolean):Ligavel{
    override fun ligar() {
    }

    override fun desligar() {
    }

    override fun estaLigado(): Boolean {
        return false
    }
}