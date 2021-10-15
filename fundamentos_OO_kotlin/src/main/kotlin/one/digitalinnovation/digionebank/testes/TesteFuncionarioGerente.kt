package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val robert = Gerente(nome = "Robert", cpf = "321654789", salario = 5000.0, senha = "senha123")

    ImprimeRelatorioFuncionario.imprime(robert)

    TesteAutentificacao().autentica(robert)
}