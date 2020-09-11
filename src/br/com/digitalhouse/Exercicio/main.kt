package br.com.digitalhouse.Exercicio

fun main() {

    var conta1 = ContaCorrente()
    var conta2 = ContaPoupanca()


    println("Saldo: ${conta1.saldo}")
    println("Saldo: ${conta2.saldo}")


    conta2.saque(90.0)
    conta2.deposito(20.0)

    println("Saldo: ${conta2.saldo}")

    conta2.recolheJuros(1)

}