package pt.ulusofona.cm.kotlin.challenge.models

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class Data(val data : Date){
    var formato = SimpleDateFormat("dd-MM-yyyy")

    fun converte() : String{
        return formato.format(data)
    }
}