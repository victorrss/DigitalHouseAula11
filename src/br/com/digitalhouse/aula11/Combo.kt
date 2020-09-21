package br.com.digitalhouse.aula11

interface Combo {
    var nome: String
    var preco: Double
    var desconto: Double

    fun somarPreco()
    fun aplicarDesconto() {
        preco -= preco * desconto / 100
    }
}   