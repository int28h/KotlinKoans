/**
 * Implement Shop.getCustomersSortedByNumberOfOrders() using sorted or sortedBy.
 * 
 * listOf("bbb", "a", "cc").sorted() == listOf("a", "bbb", "cc")
 * listOf("bbb", "a", "cc").sortedBy { it.length } == listOf("a", "cc", "bbb")
 * 
 * data class Shop(val name: String, val customers: List<Customer>)
 * data class Customer(val name: String, val city: City, val orders: List<Order>)
 *
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/sorted.html
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/kotlin.-iterable/sorted-by.html
 */
// Return a list of customers, sorted by the ascending number of orders they made
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> = customers.sortedBy({it.orders.size})
