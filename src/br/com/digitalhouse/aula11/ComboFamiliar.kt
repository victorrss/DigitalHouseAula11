package br.com.digitalhouse.aula11

import br.com.digitalhouse.aula11.util.currencyFmt


class ComboFamiliar(
        var combos: MutableList<ComboIndividual>,
        override var nome: String,
        override var desconto: Double) : Combo {

    override var preco = 0.0

    init {
        somarPreco()
        println("Combo nome criado, valor total ${preco.currencyFmt()}")
    }

    override fun somarPreco() {
        combos.forEach { combo -> preco += combo.preco }
        aplicarDesconto()
    }
}