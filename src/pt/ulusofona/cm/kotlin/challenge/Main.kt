package pt.ulusofona.cm.kotlin.challenge


import pt.ulusofona.cm.kotlin.challenge.models.Bicicleta
import pt.ulusofona.cm.kotlin.challenge.models.Carro
import pt.ulusofona.cm.kotlin.challenge.models.Motor
import pt.ulusofona.cm.kotlin.challenge.models.Pessoa
import java.text.SimpleDateFormat
import java.util.*
//import kotlin.test.assertEquals

fun testarBicicleta(){
    val bic = Bicicleta("LNupe")
    val pessoa = Pessoa("me",Date())
    println(bic)
}

fun testarMotor(){
    val motor = Motor(200,20)
    motor.ligar()
    println(motor.estaLigado())
    println(motor)
}

fun testarCarta(){
    val currentDateString = "02/27/2005 17:00:00"
    val sd = SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
    val currentDate = sd.parse(currentDateString)
    val pessoa = Pessoa("tester",currentDate)
    val carro3 = Carro("Tesla_3", Motor(20,50))
    val carro1 = Carro("Tesla_1", Motor(20,50))
    val carro2 = Carro("Tesla_2", Motor(20,50))
    pessoa.comprarVeiculo(carro1)
    pessoa.comprarVeiculo(carro2)
    pessoa.comprarVeiculo(carro3)
    pessoa.venderVeiculo("Tesla_2",pessoa)
    println(pessoa.veiculos)
}

fun testarCarro(){
    val pessoa = Pessoa("Teste",Date())
    val carro = Carro("Mercedes Benz", Motor(20,50))
    println(pessoa.temCarta())
}

fun venda(){
    val currentDateString = "02/27/2000 17:00:00"
    val sd = SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
    val currentDate = sd.parse(currentDateString)
    val pessoa1 = Pessoa("seller",currentDate)
    pessoa1.tirarCarta()
    val carro = Carro("Mercedes Benz", Motor(20,50))
    pessoa1.comprarVeiculo(carro)
    pessoa1.moverVeiculoPara("Mercedes Benz",0,0)
}

fun main() {
    //testarBicicleta()
    //testarMotor()
    //testarCarta()
    // testarCarro()
    venda()
}