package dio.digibank

import java.math.BigDecimal

class Analista(
    nome:String,
    cpf:String,
    salario: Double
): Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio(): Double = salario * 0.1
}