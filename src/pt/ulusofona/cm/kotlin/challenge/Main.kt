package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.*
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Month
import java.util.*


//import kotlin.test.assertEquals

fun testarBicicleta(){
    val bic = Bicicleta("LNupe")
    val pessoa = Pessoa("me",Date())
    pessoa.comprarVeiculo(bic)
    pessoa.moverVeiculoPara("LNupe",0,5)
    println(pessoa.veiculos.get(0))
}

fun testarMotor(){
    val motor = Motor(200,20)
    motor.ligar()
    println(motor.estaLigado())
    println(motor)
}

fun main() {
    //testarBicicleta()
    testarMotor()
}