package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main(){
    val roger = Analista(nome = "Roger", cpf = "1234567", salario = 2000.0)

    ImprimeRelatorioFuncionario.imprime(roger)
}
