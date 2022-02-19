package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.Bicicleta
import pt.ulusofona.cm.kotlin.challenge.models.Carta
import pt.ulusofona.cm.kotlin.challenge.models.Pessoa
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Month
import java.util.*



fun main() {
    val date = LocalDate.of(2016, Month.APRIL, 15)

    val pessoa = Pessoa("Tester",date)
    println(pessoa)
}