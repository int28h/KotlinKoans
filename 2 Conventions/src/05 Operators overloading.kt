/**
 * Implement a kind of date arithmetic. Support adding years, weeks and days to a date. You could be able to write the code like this: date + YEAR * 2 + WEEK * 3 + DAY * 15.
 * 
 * At first, add an extension function 'plus()' to MyDate, taking a TimeInterval as an argument. Use an utility function MyDate.addTimeIntervals().
 * 
 * fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate {
 * ...
 * }
 * 
 * Then, try to support adding several time intervals to a date. You may need an extra class.
 */
import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today 
    .addTimeIntervals(TimeInterval.YEAR, 2) 
    .addTimeIntervals(TimeInterval.WEEK, 3) 
    .addTimeIntervals(TimeInterval.DAY, 5)
}