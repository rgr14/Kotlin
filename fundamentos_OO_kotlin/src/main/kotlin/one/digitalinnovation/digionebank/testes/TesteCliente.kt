package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){

    val jose = Cliente(
        nome = "José Antonio",
        cpf = "369852147",
        clienteTipo = ClienteTipo.PF,
        senha =  "12346"
    )
    println(jose)
    TesteAutentificacao().autentica(jose)

}