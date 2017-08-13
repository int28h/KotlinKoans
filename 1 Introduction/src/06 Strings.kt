/**
 * http://kotlinlang.org/docs/reference/basic-types.html#string-literals
 * http://kotlinlang.ru/docs/reference/basic-types.html
 */
val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2} $month \d{4}"""