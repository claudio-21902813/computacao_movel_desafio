package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Pessoa(val nome:String,veiculos: List<Veiculo>,dataDeNascimento:Date,carta: Carta,posicao: Posicao){

    fun comprarVeiculo(veiculo: Veiculo){}

    fun pesquisarVeiculo(identificador : String) : Veiculo?{return null}

    fun venderVeiculo(identificador: String,comprador:Pessoa){}

    fun moverVeiculoPara(identificador: String,x:Int,y:Int){}

    fun temCarta():Boolean {return false}

    fun tirarCarta(){}

    override fun toString(): String {
        return super.toString()
    }

}