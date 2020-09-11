package br.com.digitalhouse.Exercicio

class ContaCorrente(var saldo:Double = 0.0) : Conta() {

    override fun deposito(valor: Double) { //Depositar cheque
        if ((valor > 0.0) && (saldo > 0.0)) {
            saldo += valor
            println("Deposito completo em dinheiro de $valor")
        } else {
            println("Deposito em cheque de $valor")
            saldo += valor
            var c = Cheque(300.0, "Nubank", "01/01/0001")
        }
    }

    override fun saque(valor: Double) {
        if (valor >= 0.0) {
            saldo -= valor
            println("Transação aprovada - seu saldo é : $saldo")
        } else {
            saldo -= valor
            println("Cheque especial foi usado - seu saldo é : $saldo")
        }
    }


}