package dio.digibank.testes

import dio.digibank.Funcionario

class imprimeRelatorioFuncionario {

    companion object{
        fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
    }
}