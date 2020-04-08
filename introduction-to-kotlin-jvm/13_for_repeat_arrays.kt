/*
Напишите программу, которая считывает строку и печатает её 20 раз
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    val s = scan.nextLine()
    repeat(20) { 
        println(s)
    }
}

/*
Напишите программу, которая считывает число N и слово S, а затем печатает эту строку N раз.
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    val n = scan.nextInt()
    val s = scan.next()
    for(i in 0 until n) println(s)
}

/*
Напишите программу, которая считывает последовательность из 10 чисел и разворачивает её, 
не трогая сами числа
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val arr = Array<Int>(10,{0})
    for(i in 0 until 10){
        arr[i] = scan.nextInt()
    }

    for(i in 9 downTo 0 step 1){
        print(arr[i].toString() + " ")
    }
}

/*
На вход подаётся число N, а затем последовательность из N слов, записанных через пробел 
или через строку. Нужно полностью перевернуть эту последовательность и вывести в одной строке.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val n = scan.nextInt()
    val arr = Array<String>(n){ i -> scan.next() }

    for(i in n-1 downTo 0 step 1){
        print(arr[i].reversed() + " ")
    }
}
