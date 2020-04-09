/*
Записан следующий код:

import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val a = scan.nextInt()
    val b = scan.nextInt()
    print(mult(a,b))
}

Ваша задача - написать код функции mult, принимающей два числа и возвращающей их произведение.
*/
fun mult(a: Int, b: Int): Int {
    return a*b
}

/*
Записан следующий код:

import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val a = scan.nextInt()
    val b = scan.nextInt()
    print(calc(a,b))
}

Ваша задача - написать код функции calc, принимающей два числа - a и b 
и возвращающей значение выражения 
7*(a^2−b^3)∗(a−b)
*/
fun calc(a: Int, b: Int): Int {
    return (7 * (Math.pow(a.toDouble(), 2.0) - Math.pow(b.toDouble(), 3.0)) * (a - b)).toInt()
}

/*
Записан следующий код:

import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val s = scan.next()
    print(isCapitalized(s))
}

Ваша задача - написать код функции isCapitalized, принимающей строку и возвращающей true, 
если первая её буква является заглавной и false в обратном случае.
*/
fun isCapitalized(s: String): Boolean {
    return s.first().isUpperCase()
}

/*
Записан следующий код:

import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val c1 = scan.next()[0]
    val c2 = scan.next()[0] 
    print(isCaseEquals(c1,c2))
}

Ваша задача - написать код функции isCaseEquals, принимающей два символа и возвращающей true, 
если их регистр одинаков и false иначе.
Гарантируется, что подаваемые на вход символы являются буквами.
*/
fun isCaseEquals(a: Char, b: Char): Boolean {
    return ((a.isLowerCase() && b.isLowerCase()) || (a.isUpperCase() && b.isUpperCase()))
}

/*
Записан следующий код:

import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val s1 = scan.next()
    val s2 = scan.next()
    val b  = scan.nextBoolean()
    print(check(s1,s2,ignoreCase = b))
}


Ваша задача - написать код функции check, принимающей две строки str1 и str2 и аргумент ignoreCase.
Функция возвращает true, если первые символы обоих строк равны и false в обратном случае. 
Аргумент ignoreCase указывает, нужно ли игнорировать регистр при проверке.
*/
fun check(str1: String, str2: String, ignoreCase: Boolean): Boolean {
    if (ignoreCase) {
        return str1.first().toLowerCase().equals(str2.first().toLowerCase())
    } else {
        return str1.first().equals(str2.first())
    }
}

/*
Записан следующий код:

import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val s1 = scan.next()
    val s2 = scan.next()
    
    if(scan.hasNext()) // Если на вход подается Boolean
        print(check(s1,s2,scan.nextBoolean()))
    else
        print(check(s1,s2))
}


Ваша задача - написать код функции check, принимающей две строки str1 и str2 и 
аргумент ignoreCase (по умолчанию равен false). Функция возвращает true, если первые символы 
обоих строк равны и false в обратном случае. Аргумент ignoreCase указывает, нужно ли игнорировать 
регистр при проверке.
*/
fun check(str1: String, str2: String, ignoreCase: Boolean = false): Boolean {
    if (ignoreCase) {
        return str1.first().toLowerCase().equals(str2.first().toLowerCase())
    } else {
        return str1.first().equals(str2.first())
    }
}
