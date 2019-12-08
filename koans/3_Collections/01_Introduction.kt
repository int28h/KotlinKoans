/**
 * This part was inspired by GS Collections Kata.
 * 
 * Default collections in Kotlin are Java collections, but there are lots of useful extension functions for them. For example, operations that transform a collection to another one, starting with 'to': toSet or toList.
 * 
Implement an extension function Shop.getSetOfCustomers().
 * 
 * data class Shop(val name: String, val customers: List<Customer>)
 * data class Customer(val name: String, val city: City, val orders: List<Order>)
 * 
 * https://github.com/goldmansachs/gs-collections-kata
 */
fun Shop.getSetOfCustomers(): Set<Customer> = this.customers.toSet()