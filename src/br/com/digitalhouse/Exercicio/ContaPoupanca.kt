package br.com.digitalhouse.Exercicio

class ContaPoupanca(var saldo:Double = 0.0) : Conta() {
    override fun saque(valor: Double) {
        if ((valor >= 0.0) && (saldo >= valor)) {
            saldo -= valor
            println("Transação aprovada - seu saldo é : $saldo")
        } else {
            println("Transação negada.")
        }
    }

    override fun deposito(valor: Double) {
        if (valor > 0.0) {
            saldo += valor
            println("Deposito completo - seu saldo é : $saldo")
        }
    }

    fun recolheJuros(mes: Int) {
        var juros : Double = 0.0
        juros *= (0.1 * mes)
        println("O seu juros é $juros por mês")

    }
}