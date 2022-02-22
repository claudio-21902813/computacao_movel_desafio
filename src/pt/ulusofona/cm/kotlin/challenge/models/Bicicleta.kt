package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Bicicleta(val identificador1:String):Veiculo(identificador1) {

    /*override fun toString(): String {
        return "Bicicleta | " +
                "$identificador | " +
                "${Data(dataDeAquisicao).converte()} | " +
                "$posicao"
    }*/

}