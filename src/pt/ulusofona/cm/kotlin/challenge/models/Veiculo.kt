package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Veiculo(val identificador:String,val posicao:Posicao,dataDeAquisicao:Date){
    fun requerCarta():Boolean{
        return false;
    }

    override fun toString(): String {
        return super.toString()
    }
}