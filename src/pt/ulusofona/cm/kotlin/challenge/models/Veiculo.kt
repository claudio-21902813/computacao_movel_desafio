package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Veiculo(val identificador:String): Movimentavel, Ligavel {

    public var posicao : Posicao;
    public var dataDeAquisicao : Date;

    init {
        posicao = Posicao(0,0)
        dataDeAquisicao = Date()
    }

    open fun requerCarta():Boolean{
        return false;
    }

    override fun moverPara(x: Int, y: Int) {
    }

    override fun ligar() {
        try {

        }catch(e : VeiculoLigadoException){

        }
    }

    override fun desligar() {
        try {

        }catch(e : VeiculoDesligadoException){

        }
    }

    override fun estaLigado(): Boolean {
        return false
    }

    override fun toString(): String {
        return super.toString()
    }
}