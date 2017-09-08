/**
 * Kotlin code can be easily mixed with Java code. Thus in Kotlin we don't introduce our own collections, but use standard Java ones (slightly improved). Read about read-only and mutable views on Java collections.
 * 
 * In Kotlin standard library there are lots of extension functions that make the work with collections more convenient. Rewrite the previous example once more using an extension function sortedDescending.
 * http://blog.jetbrains.com/kotlin/2012/09/kotlin-m3-is-out/#Collections
 */
 
 fun getList(): List<Int> {
    return arrayListOf(1, 5, 2).sortedDescending();
}