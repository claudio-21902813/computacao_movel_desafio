package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.ZoneId
import java.util.*
import kotlin.collections.ArrayList

class Pessoa(val nome:String,val dataDeNascimento:Date):Movimentavel{
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
            if(veiculo.identificador.equals(identificador)){
                return veiculo
            }
        }
        throw VeiculoNaoEncontradoException("Erro : Veiculo Não Encontrado")
    }

    fun venderVeiculo(identificador: String,comprador:Pessoa){
        val veiculo = pesquisarVeiculo(identificador)
        veiculos.remove(veiculo)
        if(veiculo!=null){
            comprador.comprarVeiculo(veiculo)
        }
    }

    fun moverVeiculoPara(identificador: String,x:Int,y:Int){
        var idx = 0
        for(veiculo in veiculos){
            if(veiculo.identificador.equals(identificador)){
                veiculos.get(idx).moverPara(x, y)
            }
            idx++
        }
    }

    fun temCarta():Boolean {
        return carta != null
    }

    fun tirarCarta(){
        var anoAtual = LocalDate.now().year
        var ano = dataDeNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().year
        if( (anoAtual - ano) >= 18){
            carta = Carta()
        }else{
            throw MenorDeIdadeException("Erro : Nao pode tirar a licenca de conducao")
        }
    }

    fun mesmaPosicao(x: Int,y: Int) : Boolean{
        return (x == posicao.x) && (y == posicao.y)
    }
    override fun moverPara(x: Int, y: Int) {
        if(mesmaPosicao(x, y)){
            throw AlterarPosicaoException("Erro : Nao pode mover para mesma posicao")
        }
        posicao.alterarPosicaoPara(x, y)
    }

    override fun toString(): String {
        return "Pessoa | $nome | ${Data(dataDeNascimento).converte()} | $posicao"
    }

}