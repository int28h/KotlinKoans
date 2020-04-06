/*
Напишите программу, которая считывает строку и выводит её в кавычках
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    print("\"" + scan.next() + "\"")
}

/*
Напишите программу, которая считывает число n и выводит строку вида:

Ого, у тебя целых n$DDDD*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    print("Ого, у тебя целых " + scan.nextInt() + "\$DDDD:")
}

/*
Напишите программу, которая считывает строку и выводит её первый символ три раза через пробел
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    val s = scan.nextLine()
    print(s.get(0) + " " + s.get(0) + " " + s.get(0))
}

/*
Напишите программу, которая считывает символ и выводит его в верхнем регистре
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    var c = scan.next()
    print(c.toUpperCase())
}

/*
Напишите программу, которая считывает символ и:

    Меняет его регистр, если он является буквой
    Иначе выводит строку incorrect
*/
import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    var a = scan.next().first()
    if(a.isLetter()){
        if(a.isUpperCase()){
            print(a.toLowerCase())
        } else {
            print(a.toUpperCase())
        }
    } else {
        print("incorrect")
    }
}

/*
Напишите программу, которая считывает символ и проверяет, является ли он 
английской заглавной буквой от C до Y. Если условие верно, выводит true, иначе - false
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.next().first()
    if(a in ('C'..'Y')){
        print(true)
    } else print(false)
}
