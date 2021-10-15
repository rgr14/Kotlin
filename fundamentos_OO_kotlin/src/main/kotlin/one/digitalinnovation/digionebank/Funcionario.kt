package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

abstract class Funcionario(
      nome: String,
      cpf: String,
      val salario: Double
) : Pessoa(nome,cpf){
    protected abstract fun calculoAuxilio(): Double

    override fun toString() = """
        Nome: ${nome}
        Cpf: ${cpf}
        Salário: ${salario}
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}