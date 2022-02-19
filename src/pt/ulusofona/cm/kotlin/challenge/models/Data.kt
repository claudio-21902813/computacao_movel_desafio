package pt.ulusofona.cm.kotlin.challenge.models

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class Data(val data : String){
    var formato = DateTimeFormatter.ofPattern("yyyy-mm-dd")

    fun converte() : LocalDate{
        return LocalDate.parse("" +this.data,formato)
    }
}