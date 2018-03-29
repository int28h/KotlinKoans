/*
Read about delegated properties and make the property lazy by using delegates.

http://kotlinlang.org/docs/reference/delegated-properties.html
*/
class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}
