/**
 * Read about extension functions. Then implement extension functions Int.r() and Pair.r() and make them convert Int and Pair to RationalNumber.
 * http://kotlinlang.org/docs/reference/extensions.html
 * http://kotlinlang.ru/docs/reference/extensions.html
*/
fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)