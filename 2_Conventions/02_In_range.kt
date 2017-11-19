/**
 * In Kotlin in checks are translated to the corresponding contains calls:
 * 
 * val list = listOf("a", "b")
 * "a" in list  // list.contains("a")
 * "a" !in list // !list.contains("a")
 * data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate>
 * 
 * Read about ranges. Add a method fun contains(d: MyDate) to the class DateRange to allow in checks with a range of dates.
 * http://kotlinlang.org/docs/reference/ranges.html
 */
 class DateRange(val start: MyDate, val endInclusive: MyDate){
    operator fun contains(d: MyDate) = d >= start && d <= endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}