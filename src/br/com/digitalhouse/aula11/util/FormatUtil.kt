// Arquivo: FormatUtil.kt
package br.com.digitalhouse.aula11.util

import java.text.NumberFormat
import java.util.*

fun kotlin.Double.currencyFmt(): String {
    return NumberFormat.getCurrencyInstance(Locale("pt", "BR")).format(this)
}

/*
    val valor: Double = 15.50
    println(valor.currencyFmt())
    // vai printar R$ 15.50
 */
