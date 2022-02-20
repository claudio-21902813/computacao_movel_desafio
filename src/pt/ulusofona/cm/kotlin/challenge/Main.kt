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
    println(pessoa.veiculos)
}

fun main() {
    testarBicicleta()
}