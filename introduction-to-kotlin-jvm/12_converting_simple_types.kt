/*
Напишите программу, которая считывает символ и выводит символ, идущий за ним
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    val ch = scan.next().first()
    val i = ch.toInt() + 1
    print(i.toChar())
}

/*
Напишите программу, которая считывает строку вида 'n'﻿, где n - некий символ, и печатает его код
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    val ch = scan.nextLine().get(1)
    print(ch.toInt())
}

/*
Напишите программу, которая считывает число типа Long, прибавляет к нему 1 и 
заменяет предпоследнюю цифру на символ Σ
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    var a = scan.nextLong() + 1
    val length = a.toString().length
    print(a.toString().substring(0, length-2) + 'Σ' + a.toString().get(length-1))
}

/*
Напишите программу, которая считывает 3 переменных типа Int, складывает их, 
затем меняет местами первую и последнюю цифры и выводит без ведущих нулей.

Гарантируется, что сумма имеет при себе хотя бы два разряда.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()
    var sum = a + b + c
    val first = sum.toString().first()
    val last = sum.toString().last()
    print((last + sum.toString().substring(1, sum.toString().length-1) + first).toInt())
}
