package br.com.digitalhouse.Aula3Kotlin

class Pessoa(idade: Int = 0, especie: String = "",val nome : String = "") : Animal(idade, especie) {

    override fun locomover() {
        for (passos in 0..10) {
            println("A pessoa está no passo $passos .")
        }
    }

    override fun comer() {
        TODO("Not yet implemented")
    }


    fun idadePessoa() {
        super.idade()
        println("Nome $nome é uma pessoa também.")
    }



}