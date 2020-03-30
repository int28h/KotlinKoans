/*
Напишите программу, которая считывает число и выводит "Да", если оно является чётным.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args:Array<String>){
    var a = scan.nextInt() % 2
    if(a == 0) print("Да")
}

/*
Напишите программу, которая считывает число и выводит "Да", если оно является чётным и "Нет", 
если не является.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args:Array<String>){
    var a = scan.nextInt() % 2
    if(a == 0) print("Да") else print("Нет")
}

/*
Напишите программу, которая считывает число и выводит "Число равно нулю", если число равно 0, 
"Число положительное", если оно является положительным и 
"Число отрицательное", если число является отрицательным.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args:Array<String>){
    var a = scan.nextInt()
    if(a == 0) print("Число равно нулю") 
    else if (a > 0) print("Число положительное")
    else print("Число отрицательное")
}
