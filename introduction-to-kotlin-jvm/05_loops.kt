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