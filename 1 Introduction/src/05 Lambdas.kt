/**
 * http://kotlinlang.org/docs/reference/lambdas.html
 * http://kotlinlang.ru/docs/reference/lambdas.html
 */
fun containsEven(collection: Collection<Int>): Boolean = collection.any {it%2 == 0}