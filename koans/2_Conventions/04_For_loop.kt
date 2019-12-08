/**
 * Kotlin for loop iterates through anything that provides an iterator. Make the class DateRange implement Iterable<MyDate>, so that it could be iterated over. You can use the function MyDate.nextDay().
 * 
 * data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate>
 *
 *  http://kotlinlang.org/docs/reference/control-flow.html#for-loops
 */ 
 
import java.util.NoSuchElementException;

class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate>{
    override fun iterator(): Iterator<MyDate>  = object : Iterator<MyDate> {
        var current = start

        override fun next(): MyDate {
            if (hasNext()) {
				val result = current
				current = current.nextDay()
				return result               
            } else throw NoSuchElementException()            
        }

        override fun hasNext() : Boolean {
			return current <= end
		}
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in DateRange(firstDate, secondDate)) {
        handler(date)
    }
}