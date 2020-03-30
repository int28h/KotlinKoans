/*
Напишите программу, которая считывает целое число и умножает его на 10, а затем выводит в консоль.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    println(scan.nextInt() * 10)
}

/*
Напишите программу, которая считывает целые числа a a a и b b b, находит и печатает значение выражения:
3*(a+b)
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.nextInt()
    val b = scan.nextInt()
    println(3 * (a + b))
}
