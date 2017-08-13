/**
 * http://kotlinlang.org/docs/reference/object-declarations.html
 * http://kotlinlang.ru/docs/reference/object-declarations.html
*/
import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object: Comparator<Int> {
        override fun compare(x: Int, y: Int) = y-x; 
    })
    return arrayList
}