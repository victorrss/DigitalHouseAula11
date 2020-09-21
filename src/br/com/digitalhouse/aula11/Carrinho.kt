package br.com.digitalhouse.aula11

class Carrinho {
    var precoTotal: Double = 0.0

    fun adicionarSanduiche(sand: Sanduiche) {
        precoTotal += sand.preco
        println("O sanduíche de ${sand.sabor}(${sand.preco}) foi adicionado no carrinho")
    }

    fun adicionarAcompanhamento(acom: Acompanhamento) {
        precoTotal += acom.preco
        println("O acompanhamento ${acom.nome}(${acom.tamanho}), sabor ${acom.sabor} no valor de ${acom.preco} foi adicionado no carrinho")
    }

    fun adicionarCombo(cb: Combos) {
        precoTotal += cb.preco - cb.desconto
        println("O combo ${cb.nome}(${cb.preco}) foi adicionado no carrinho")
    }

    fun informarValorTotal() : Double {
        return precoTotal
    }
}