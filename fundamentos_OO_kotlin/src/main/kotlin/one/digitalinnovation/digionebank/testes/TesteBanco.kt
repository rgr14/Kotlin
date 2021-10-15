package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digOneBank = Banco(nome= "DigiOne", numero = 12)

    println(digOneBank.nome)
    println(digOneBank.numero)

    val banco2 = digOneBank.copy(nome = "Banco2", numero = 7)

    println(banco2.info())

}