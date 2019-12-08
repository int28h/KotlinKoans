/**
 * Implement Customer.getTotalOrderPrice() using sum or sumBy.
 * 
 * listOf(1, 5, 3).sum() == 9
 * listOf("a", "b", "cc").sumBy { it.length() } == 4
 * 
 * data class Customer(val name: String, val city: City, val orders: List<Order>)
 * data class Order(val products: List<Product>, val isDelivered: Boolean)
 * data class Product(val name: String, val price: Double)
 * 
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/sum.html
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/sum-by.html
 */
// Return the sum of prices of all products that a customer has ordered.
// Note: the customer may order the same product for several times.
fun Customer.getTotalOrderPrice(): Double = orders.flatMap({it.products}).sumByDouble({it.price})
