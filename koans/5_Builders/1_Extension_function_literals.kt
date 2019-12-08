/*
Read about function literals with receiver.

You can declare isEven and isOdd as values, that can be called as extension functions. Complete the declarations below.

https://kotlinlang.org/docs/reference/lambdas.html#function-literals-with-receiver
*/
fun task(): List<Boolean> {
    val isEven: Int.() -> Boolean = { this % 2 == 0 }
    val isOdd: Int.() -> Boolean = { !isEven() }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}