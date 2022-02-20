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
    println(pessoa.temCarta())
    pessoa.tirarCarta()
    println(pessoa.temCarta())
    val carro = Carro("Tesla", Motor(20,50))
    pessoa.comprarVeiculo(carro)
    println(pessoa.pesquisarVeiculo("Tesla"))
}

fun main() {
    //testarBicicleta()
    //testarMotor()
    testarCarta()
}