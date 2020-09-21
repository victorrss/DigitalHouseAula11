package br.com.digitalhouse.aula11

class ComboIndividual(var sanduiche: List<Sanduiche>, var acompanhamento: MutableList<Acompanhamento>) {
    fun somarPreco() {
        for (sanduiche in sanduiche) {
            preco += combo.preco
        }
        for (acompanhamento in acompanhamento) {
            preco += acompanhamento.preco;
        }
    }

    fun aplicarDesconto() {

    }
}