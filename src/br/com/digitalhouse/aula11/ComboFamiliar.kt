package br.com.digitalhouse.aula11

class ComboFamiliar(var combos: MutableList<ComboIndividual>, override var nome: String, override var desconto: Double) : Combo {
    override var preco = 0.0
    override fun somarPreco() {
        combos.forEach { combo -> preco += combo.preco }
    }
}