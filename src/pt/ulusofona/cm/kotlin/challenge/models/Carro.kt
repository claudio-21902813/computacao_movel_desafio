package pt.ulusofona.cm.kotlin.challenge.models

class Carro(val identificador:String,val motor : Motor):Ligavel,Movimentavel{
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