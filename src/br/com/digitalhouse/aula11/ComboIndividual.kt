package br.com.digitalhouse.aula11

import br.com.digitalhouse.aula11.util.FormatUtil

class ComboIndividual(
        var sanduiches: List<Sanduiche>,
        var acompanhamentos: MutableList<Acompanhamento>,
        override var nome: String,
        override var desconto: Double) : Combo {
    override var preco: Double = 0.0

    init {
        somarPreco()
        println("Combo $nome criado, valor total ${FormatUtil.currencyFmt(preco)}")
    }

    override fun somarPreco() {
        sanduiches.forEach { sanduiche -> preco += sanduiche.preco }
        acompanhamentos.forEach { acompanhamento -> preco += acompanhamento.preco }
        aplicarDesconto()
    }
}