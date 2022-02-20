package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Bicicleta(identificador:String):Veiculo(identificador) {

    override fun toString(): String {
        return "Bicicleta | " +
                "$identificador | " +
                "${Data(dataDeAquisicao).converte()} | " +
                "$posicao"
    }

}