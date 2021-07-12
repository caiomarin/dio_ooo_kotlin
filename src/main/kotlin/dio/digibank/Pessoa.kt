package dio.digibank

class Pessoa {
    var nome: String = "Caio"
    var cpf: String = "363.930.068-89"
}

fun main(){
    val jether = Pessoa()
    println(jether.nome)
}