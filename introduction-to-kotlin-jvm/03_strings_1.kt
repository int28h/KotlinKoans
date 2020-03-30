/*
Напишите программу, которая считывает строку и выводит через пробел её первый и последний символ.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val str = scan.nextLine()
    println(str.get(0) + " " + str.get(str.length - 1))
}

/*
Напишите программу, которая считывает строку s и выводит ту же строку, заменяя первый символ на букву Q.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val str = scan.nextLine()
    println("Q" + str.substring(1))
}

/*
Напишите программу, которая считывает строку и выводит её в верхнем регистре.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    var str = scan.nextLine()
    println(str.toUpperCase())
}
