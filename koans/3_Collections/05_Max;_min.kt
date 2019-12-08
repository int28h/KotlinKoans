/**
 * Implement Shop.getCustomerWithMaximumNumberOfOrders() and Customer.getMostExpensiveOrderedProduct() using max, min, maxBy, or minBy.
 * 
 * listOf(1, 42, 4).max() == 42
 * listOf("a", "ab").minBy { it.length } == "a"
 * 
 * data class Shop(val name: String, val customers: List<Customer>)
 * data class Customer(val name: String, val city: City, val orders: List<Order>)
 * data class Order(val products: List<Product>, val isDelivered: Boolean)
 * data class Product(val name: String, val price: Double)
 *
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/max.html
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/min.html
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/max-by.html
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/min-by.html
 */
// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = this.customers.maxBy{it.orders.count()}

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? = this.orders.flatMap{it.products}.maxBy{it.price}
