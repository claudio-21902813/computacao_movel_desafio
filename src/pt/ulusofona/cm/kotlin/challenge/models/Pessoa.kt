package pt.ulusofona.cm.kotlin.challenge.models

import java.time.LocalDate
import java.util.*

class Pessoa(val nome:String,val dataDeNascimento:LocalDate){
    public var veiculos : List<Veiculo>;
    public var carta : Carta;
    public var posicao : Posicao;

    init {
        carta = Carta()
        posicao = Posicao(0,0)
        veiculos = emptyList()
    }

    fun comprarVeiculo(veiculo: Veiculo){}
    fun pesquisarVeiculo(identificador : String) : Veiculo?{return null}
    fun venderVeiculo(identificador: String,comprador:Pessoa){}
    fun moverVeiculoPara(identificador: String,x:Int,y:Int){}
    fun temCarta():Boolean {return false}
    fun tirarCarta(){}

    override fun toString(): String {
        return "Pessoa | $nome | $dataDeNascimento | $posicao"
    }

}