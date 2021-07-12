package dio.digibank

class Banco(
    val nome: String,
    val numero: Int
){
    fun info() = "$nome -$numero"
}