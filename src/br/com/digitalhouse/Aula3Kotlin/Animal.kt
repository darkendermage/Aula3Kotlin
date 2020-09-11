package br.com.digitalhouse.Aula3Kotlin

abstract class Animal (open val idade: Int = 0, open val especie: String = "") {

    open fun locomover() {
        println("Animal locomove.")
    }

    fun idade() {
        println("Animal tem $idade anos de idade e é da espécie $especie.")
    }

    abstract fun comer()
}