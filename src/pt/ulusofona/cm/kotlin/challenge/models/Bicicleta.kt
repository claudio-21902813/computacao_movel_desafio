package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Bicicleta(identificador:String): Movimentavel,Veiculo(identificador) {
    override fun moverPara(x: Int, y: Int) {
        TODO("Not yet implemented")
    }
}