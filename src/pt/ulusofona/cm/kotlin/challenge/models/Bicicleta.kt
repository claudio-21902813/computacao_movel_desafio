package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Bicicleta(identificador:String): Movimentavel,Veiculo(identificador) {

    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x, y)
    }

    override fun toString(): String {
        return "Bicicleta | " +
                "$identificador |" +
                "$dataDeAquisicao |" +
                "$posicao"
    }

}