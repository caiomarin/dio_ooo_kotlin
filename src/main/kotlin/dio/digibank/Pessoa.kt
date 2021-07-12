package dio.digibank

class Pessoa {
    var nome: String = "Caio"
    var cpf: String = "363.930.068-89"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val jether = Pessoa()
    println(jether.pessoaInfo())
}