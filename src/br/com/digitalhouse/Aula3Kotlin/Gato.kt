package br.com.digitalhouse.Aula3Kotlin

class Gato : Felino() {

    override val cor: String = "Amarelo"
    override fun comer() {
        TODO("Not yet implemented")
    }

    fun gatoAndando() {
        super.locomover()
        println("A cor é $cor .")
    }

}