/*
Напишите программу, которая считывает целое число, делит его на 10 ﻿и выводит получившееся частное.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val i = scan.nextInt()
    println(i / 10)
}

/*
Напишите программу, которая считывает целые числа a a a и b b b и находит значение выражения: 5*(b−a)
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.nextInt()
    val b = scan.nextInt()
    println(5 * (b - a))
}

/*
Напишите программу, которая считывает два числа и выводит их в обратном порядке через пробел.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    var a = scan.nextInt()
    var b = scan.nextInt()
    print("$b $a")
}

/*
Напишите программу, которая считывает трехзначное число и разворачивает его.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    println(scan.nextLine().reversed())
}

/*
Напишите программу, которая считывает два трёхзначных числа и складывает первый и третий разряд 
каждого из них. Например, если введены числа 191 и 292, ответом будет число 6 (1+1+2+2=6).
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.nextInt()
    val b = scan.nextInt()
    print((a/100).toInt() + a%10 + (b/100).toInt() + b%10)
}

/*
Напишите программу, которая считывает число от 1000 до 9999, разворачивает его и выводит без ведущих нулей:
1300 -> 0031 -> 31 // т.е. нули спереди числа - ведущие нули
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    var a = scan.nextInt() 
    a = ((a % 10) * 1000) + ((a / 10 % 10) * 100) + ((a / 100 % 10) * 10) + (a / 1000) 
    println(a)
}

/*
Напишите программу, которая считывает строку и печатает её 3 раза через пробел.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val s = scan.nextLine()
    print(s + " " + s + " " + s)
}

/*
Считайте 5 слов, введенных через пробел, и выведите их в обратном порядке.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    print(scan.nextLine().split(" ").reversed().joinToString(separator=" "))
}

/*
Напишите программу, которая считывает строку и выводит её сначала в верхнем регистре, 
а потом - в нижнем через пробел
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val s = scan.nextLine().toString()
    print(s.toUpperCase() + " " + s.toLowerCase())
}

/*
Напишите программу, которая считывает строку sи заменяет символ с индексом 1на букву F, 
а предпоследний символ - на букву L.

Гарантируется, что строка состоит минимум из четырёх символов.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    println(scan.next().let {
        "${it.first()}F${it.substring(2).dropLast(2)}L${it.last()}"
    })
}
