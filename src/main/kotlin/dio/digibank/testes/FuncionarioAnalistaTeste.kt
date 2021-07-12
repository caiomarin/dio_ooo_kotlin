package dio.digibank.testes

import dio.digibank.Analista

fun main(){
    val joao = Analista("Joao","363.930.068-89", 10200.0)
    imprimeRelatorioFuncionario.imprimeRelatorio(joao)

}