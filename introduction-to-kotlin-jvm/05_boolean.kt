/*
Напишите программу, которая считывает два числа и выводит true, 
если первое из них больше второго и false, если это не так
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.nextInt()
    val b = scan.nextInt()
    println(a > b)
}

/*
Напишите программу, которая считывает два числа и выводит false, 
если они равны и true, если они не равны.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.nextInt()
    val b = scan.nextInt()
    println(a != b)
}

/*
Напишите программу, которая считывает переменную типа Boolean и выводит противоположное ей значение.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val b = scan.nextBoolean()
    print(!b)
}
