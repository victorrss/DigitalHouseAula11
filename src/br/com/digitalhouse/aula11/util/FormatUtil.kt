package br.com.digitalhouse.aula11.util

import java.text.NumberFormat
import java.util.*

class FormatUtil {
    companion object {
        fun currencyFmt(d: Double): String {
            return NumberFormat.getCurrencyInstance(Locale("pt", "BR")).format(d)
        }
    }
}