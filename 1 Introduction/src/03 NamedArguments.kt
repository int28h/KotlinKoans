/**
 * http://kotlinlang.org/docs/reference/functions.html#default-arguments
 * http://kotlinlang.ru/docs/reference/functions.html
 */
fun joinOptions(options: Collection<String>) =
        options.joinToString(prefix = "[", postfix = "]")