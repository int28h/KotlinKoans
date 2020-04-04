/*
Напишите программу, которая считывает переменную типа Double и выводит её значение, уменьшенное на единицу
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
	print(scan.nextDouble()-1)
}

/*
Напишите программу, которая считывает две переменных типа Double и выводит:

    "Да", если округлённые по правилам математики значения переменных равны
    "Нет" в обратном случае
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
   val x = scan.nextDouble()
   val y = scan.nextDouble()
   print(if (Math.round(x) == Math.round(y)) "Да" else "Нет") 
}

/*
Напишите программу, которая считывает четыре переменных типа Int и выводит максимальное из них
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
   print(scan.nextLine().split("").max())
}

/*
Напишите программу, которая считывает четыре переменных типа Int и переменную E типа Boolean. 
И выводит:

    Если E = true, то минимальное из этих чисел
    Иначе - максимальное.

NB! При наличии нескольких минимумов/максимумов выводим ровно одно из них.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
        val a = scan.nextInt()
        val b = scan.nextInt()
        val c = scan.nextInt()
        val d = scan.nextInt()
        val E = scan.nextBoolean()
        when(E){
            true -> print(Math.min(Math.min(a,b),Math.min(c,d)))
            else -> print(Math.max(Math.max(a,b),Math.max(c,d)))
        }
}

/*
Напишите программу, которая считывает числа A, B, C, D, E и F, 
и рассчитывает стоимость путёвки в лагерь, если:

    Ребёнок питается A раз в день
    Стоимость одного обеда - B рублей
    Стоимость одного дня проживания - C рублей
    Путь на поезде в одно направление стоит D рублей
    Смена длится E дней
    Персональная скидка - F рублей
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
   val a = scan.nextInt()
   val b = scan.nextInt()
   val c = scan.nextInt()
   val d = scan.nextInt()
   val e = scan.nextInt() 
   val f = scan.nextInt()
   print((a * b + c) * e + 2 * d - f)
}

/*
Напишите программу, которая считывает переменные a и b типа Int и выводит:

    Минимальное из них, если их сумма делится на 2 без остатка
    Иначе - максимальное из них
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.nextInt()
    val b = scan.nextInt()
    val res = if ((a + b) % 2 == 0) Math.min(a, b) else Math.max(a, b)
    println(res)
}

/*
Напишите программу, которая считывает переменную типа Double и выводит её синус, умноженный на её косинус.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val x = scan.nextDouble()
    print(Math.sin(x) * Math.cos(x))
}
