package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Veiculo(val identificador:String): Movimentavel, Ligavel {
    var posicao : Posicao;
    var dataDeAquisicao : Date;
    var ligado : Boolean

    init {
        posicao = Posicao(0,0)
        dataDeAquisicao = Date()
        ligado = false
    }

    open fun requerCarta():Boolean{
        return false;
    }

    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x,y)
    }

    override fun ligar() {
        if(estaLigado()){
            throw VeiculoLigadoException("veiculo Ligado!")
        }
        ligado = true
    }

    override fun desligar() {
        if(!estaLigado()){
            throw VeiculoDesligadoException("Veiculo Desligado!")
        }
        ligado = false
    }

    override fun estaLigado(): Boolean {
        return ligado == true
    }
}