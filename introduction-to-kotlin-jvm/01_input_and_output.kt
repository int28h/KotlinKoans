/*
Напишите программу, которая выведет на экран строку "Hello world!".
*/
fun main(args: Array<String>){
    println("Hello world!")
}

/*
Выведите на экран строку "My name is " и ваше имя следом.
*/
fun main(args: Array<String>){
    println("My name is Vasya")
}


/*
Напишите программу, которая считывает строку и выводит её в консоль.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    println(scan.nextLine())
}

/*
Напишите программу, которая считывает строку и выводит её три раза.
*/
fun main(args: Array<String>){
    val a = readLine()
    repeat(3) {
		println(a)
	}
}
