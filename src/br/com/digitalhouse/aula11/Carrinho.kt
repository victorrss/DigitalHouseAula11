package br.com.digitalhouse.aula11

import br.com.digitalhouse.aula11.util.FormatUtil

class Carrinho {
    var precoTotal: Double = 0.0

    fun adicionarSanduiche(vararg sand: Sanduiche) {
        sand.forEach { sand ->
            precoTotal += sand.preco
            println("O sanduíche de ${sand.sabor}(${FormatUtil.currencyFmt(sand.preco)}) foi adicionado no carrinho")
        }
    }

    fun adicionarAcompanhamento(vararg acom: Acompanhamento) {
        acom.forEach { acom ->
            precoTotal += acom.preco
            println("O acompanhamento ${acom.nome}(${acom.tamanho}), ${if (acom.sabor != null) "sabor ${acom.sabor}" else "" } no valor de ${FormatUtil.currencyFmt(acom.preco)} foi adicionado no carrinho")
        }
    }

    fun adicionarCombo(vararg cb: Combo) {
        cb.forEach { cb ->
            precoTotal += cb.preco
            println("O combo ${cb.nome}(${FormatUtil.currencyFmt(cb.preco)}) foi adicionado no carrinho")
        }
    }

    fun informarValorTotal(): Double {
        return precoTotal
    }

    override fun toString(): String {
        return "Preço total de sua compra: ${FormatUtil.currencyFmt(informarValorTotal())}"
    }
}