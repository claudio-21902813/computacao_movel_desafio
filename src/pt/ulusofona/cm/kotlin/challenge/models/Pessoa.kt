package pt.ulusofona.cm.kotlin.challenge.models

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*
import kotlin.collections.ArrayList

class Pessoa(val nome:String,val dataDeNascimento:Date){
    public var veiculos : MutableList<Veiculo>;
    public var carta : Carta?;
    public var posicao : Posicao;

    init {
        carta = null
        posicao = Posicao(0,0)
        veiculos = ArrayList()
    }

    fun comprarVeiculo(veiculo: Veiculo){
        veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador : String) : Veiculo?{
        for(veiculo in veiculos){
            if(veiculo.identificador == identificador){
                return veiculo
            }
        }
        return null
    }

    fun venderVeiculo(identificador: String,comprador:Pessoa){}

    fun moverVeiculoPara(identificador: String,x:Int,y:Int){
        var idx = 0
        for(veiculo in veiculos){
            if(!veiculo.identificador.equals(identificador)){
                veiculos.get(idx).moverPara(x, y)
            }
            idx++
        }
    }
    fun temCarta():Boolean {return false}

    fun tirarCarta(){}

    override fun toString(): String {
        return "Pessoa | $nome | ${Data(dataDeNascimento).converte()} | $posicao"
    }

}