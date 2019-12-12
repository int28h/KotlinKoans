/*
Напишите программу, которая считывает символ и выводит символ, идущий за ним

Sample Input 1:
а
Sample Output 1:
б

Sample Input 2:
ζ
Sample Output 2:
η
*/

import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    val ch = scan.next().first()
    val i = ch.toInt() + 1
    print(i.toChar())
}

