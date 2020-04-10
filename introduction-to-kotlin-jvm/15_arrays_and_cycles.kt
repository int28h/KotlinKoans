/*
Напишите программу, которая считывает строку из нескольких слов, а затем выводит эти слова через запятую.
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    print(scan.nextLine().replace(" ", ", "))
}

/*
Напишите программу, которая считывает несколько чисел и выводит их в формате массива JSON. Пример:

[1, 2, 3]
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    print("[" + scan.nextLine().replace(" ", ", ") + "]")
}

/*
Напишите программу, которая считывает несколько строк и выводит их в формате массива JSON. Пример:

["one", "two", "three"]
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    print("[\"" + scan.nextLine().replace(" ", "\", \"") + "\"]")
}

/*
Напишите программу, которая считывает два числа - A и B, и выводит сумму всех чисел от A до B включительно
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    val a = scan.nextInt()
    val b = scan.nextInt()

    var result = 0

    for(i in a until b + 1){
        result += i
    }

    print(result)
}

/*
Напишите программу, которая считывает число N и выводит N первых натуральных чисел, кратных 5
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    val n = scan.nextInt()
    var m = 0

    for(i in 0 until n){
        m += 5
        print(m.toString() + " ")
    }
}

/*
Напишите программу, которая считывает число N и число K и выводит N первых чисел, кратных K.
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    val n = scan.nextInt()
    val k = scan.nextInt()
    var m = 0

    for(i in 0 until n){
        m += k
        print(m.toString() + " ")
    }
}

/*
Напишите программу, которая запрашивает число N, далее последовательность из N чисел, 
и выводит сумму всех элементов.
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    val n = scan.nextInt()
    var res = 0
    for(i in 0 until n){
        res += scan.nextInt()
    }
    print(res)
}

/*
Напишите программу, которая запрашивает число N, далее последовательность из N чисел, затем число K. 
Далее нужно вывести сумму всех элементов массива, равных K﻿.
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    val n = scan.nextInt()

    val arr = Array<Int>(n, {0})
    for(i in 0 until n){
        arr[i] = scan.nextInt()
    }

    val k = scan.nextInt()
    var res : Int = 0
    for(i in 0 until n){
        if(arr[i] == k){
            res += arr[i]
        }
    }
    print(res)
}
