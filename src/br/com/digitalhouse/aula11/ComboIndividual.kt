package br.com.digitalhouse.aula11

class ComboIndividual(var sanduiche: List<Sanduiche>, var acompanhamento: MutableList<Acompanhamento>, override var nome: String, override var preco: Double, override var desconto: Double) : Combo {
    override fun somarPreco() {
        for (sanduiche in sanduiche) {
            preco += sanduiche.preco
        }
        for (acompanhamento in acompanhamento) {
            preco += acompanhamento.preco;
        }
    }
}