/*
The previous examples can be rewritten using the library function apply (see examples below). 
Write your own implementation of this function named 'myApply'.

https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/apply.html
*/
fun <T> T.myApply(f: T.() -> Unit): T { return apply(f) }

fun createString(): String {
    return StringBuilder().myApply {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }.toString()
}

fun createMap(): Map<Int, String> {
    return hashMapOf<Int, String>().myApply {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}