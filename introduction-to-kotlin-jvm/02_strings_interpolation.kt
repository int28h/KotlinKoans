/*
Напишите программу, которая считывает строку s и заменяет символ с индексом 1 на букву F, 
а предпоследний символ - на букву L.

Гарантируется, что строка состоит минимум из четырёх символов.

Sample Input 1:
Hello!

Sample Output 1:
HFllL!

Sample Input 2:
kotlin!

Sample Output 2:
kFtliL!
*/

// 1
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    println(scan.next().let {
        "${it.first()}F${it.substring(2).dropLast(2)}L${it.last()}"
    })
}

// 2
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    var s = scan.next();
    print("${s[0]}F${s.substring(2,s.length-2)}L${s[s.length-1]}");
}

// 3 без интерполяции
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    var s = scan.next();
    print("${s[0]}F${s.substring(2,s.length-2)}L${s[s.length-1]}");
}