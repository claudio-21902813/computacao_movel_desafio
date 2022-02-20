package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.*
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Month
import java.util.*
import kotlin.test.assertEquals


fun main() {
    val pessoa = Pessoa("Tester", Date())
    println(pessoa)
    val v = Carro("Teste", Motor(100,50))
    pessoa.comprarVeiculo(v)

    assertEquals(null,pessoa.pesquisarVeiculo("teste"))
    assertEquals(v,pessoa.pesquisarVeiculo("Teste"))
}