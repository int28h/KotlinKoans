/*
Напишите программу, которая считывает два слова, введенных через пробел, и выводит true, если они равны
и false, если не равны.

Регистр не учитывать.
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    val a = scan.next().toLowerCase()
    val b = scan.next().toLowerCase()
    print(a.equals(b))
}

/*

Напишите программу, которая считывает пять различных имён, записанных через пробел 
и исправляет ошибки в их написании.

Sample Input:
Катя маша анатолий Антон вася

Sample Output:
Катя Маша Анатолий Антон Вася


*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    for (i in 0..4) {
        print(scan.next().capitalize() + " ")
    } 
}

/*
Внимание, генерал! В наши войска пробрался гриб! 
Нам нужно вычислить и обезвредить его.
На вход подаются строки A и B, разделенные пробелом. 
Строка A - список людей в казарме. Строка B - сигнатура гриба.
Вывести строку A, заменяя все грибы на символ _
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    val a = scan.next()
    val b = scan.next()
    print(a.replace(b, "_"))
}

/*
На вход подаются строки A и B﻿, разделённые пробелом. 
Строка A - список людей в казарме. B - сигнатура шпиона.
Вывести строку A, заменяя всех шпионов на символ _ и количество шпионов через пробел.

Гарантируется, что в строке A символов _ изначально нет.
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    var a = scan.next()
    var b = scan.next()
    print(a.replace(b, "_") + " " + (a.length - a.replace(b, "").length));
}

/*
В районе перестало работать водоснабжение. Рабочие решили просканировать водопроводную трубу, чтобы
 понять, в какой части прорвало трубу.

На вход подаются две последовательности символов. В первой содержится описание трубы, состоящее из
 знаков = и последовательности символов, обозначающей место проблемы. Во второй описано обозначение
 затора, состоящее из 1 и более непробельных символов.

Вывести:

    1, если трубу прорвало в начале
    2, если трубу прорвало в середине
    3, если трубу прорвало в конце
    4, если трубу вообще не прорвало

Гарантируется, что трубу прорвало (если прорыв вообще имеет место быть) ровно в одном месте.
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    var A = scan.next()
    var b = scan.next()
    when{
        A.startsWith(b)-> println("1")
        !(A.endsWith(b)) && !(A.startsWith(b)) && (A.contains(b))-> println("2")
        A.endsWith(b)-> println("3")
        !(A.contains(b))-> println("4")
    }
}

