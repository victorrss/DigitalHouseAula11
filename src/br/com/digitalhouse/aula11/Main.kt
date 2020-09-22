package br.com.digitalhouse.aula11

fun main() {
    val carrinho = Carrinho()

    val sandXSalada = Sanduiche("X-Salada", 15.50);
    val acompBatata = Acompanhamento("Batata frita", 5.90, "M", null)

    val cbIndAnanda = ComboIndividual(
            listOf(sandXSalada),
            mutableListOf(acompBatata),
            "Ananda",
            5.0
    )

    val cbIndLucas = ComboIndividual(
            listOf(Sanduiche("Barato do dia Subway", 10.00)),
            mutableListOf(
                    Acompanhamento("Macaxeira frita", 7.9, "M", null),
                    Acompanhamento("Suco", 6.00, "M", "Cajá")
            ),
            "Lucas",
            5.0
    )

    val cbFamiliar = ComboFamiliar(
            mutableListOf(cbIndAnanda, cbIndLucas),
            "Irmãos Silva",
            5.0
    )

    carrinho.adicionarCombo(cbFamiliar, cbIndAnanda, cbIndLucas)
    carrinho.adicionarSanduiche(sandXSalada)
    carrinho.adicionarAcompanhamento(acompBatata)
}