package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Pessoa(val nome:String,dataDeNascimento:Date){

    public var veiculos : List<Veiculo>;
    public var carta : Carta;
    public val posicao : Posicao;

    init {
        carta = Carta()
        posicao = Posicao(0,0)
        veiculos = emptyList()
    }
    val _carta get() = carta
    val _veiculos get() = veiculos
    val _posicao get() = posicao

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