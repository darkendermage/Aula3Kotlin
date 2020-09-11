package br.com.digitalhouse.Aula3Kotlin

open class Felino(open val cor: String = "Negra") : Animal() {

    final override fun locomover() {
        for (passos in 0..2) {
            println("o felino está no passo $passos e tem a cor $cor.")
        }
    }

    override fun comer() {
        TODO("Not yet implemented")
    }
}