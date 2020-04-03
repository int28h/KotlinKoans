/*
Напишите программу, которая считывает переменную типа Double и выводит её синус.
*/
fun main(args: Array<String>) = print(Math.sin(readLine()!!.toDouble()))

/*
Напишите программу, которая считывает переменную типа Double и выводит её косинус.
*/
val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)
fun main(args: Array<String>){
   print(Math.cos(scan.nextDouble()))
}

/*
Напишите программу, которая считывает переменную типа Double и выводит её тангенс.
*/
val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)
fun main(args: Array<String>){
   print(Math.tan(scan.nextDouble()))
}

/*
Напишите программу, которая считывает переменную типа Double и извлекает из неё квадратный корень.
*/
val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)
fun main(args: Array<String>){
   println(Math.pow(scan.nextDouble(),1/2.toDouble()))
}

/*
Напишите программу, которая считывает переменную R R R типа Double - радиус окружности, 
и выводит площадь круга с таким  радиусом, ﻿округлённую по правилам математики 
*/
val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)
fun main(args: Array<String>){
    print (Math.round(Math.PI*Math.pow(scan.nextDouble(),2.0)))
}

/*
Напишите программу, которая считывает переменные p и h типа Double, 
рассчитывает давление жидкости на дно и стенки сосуда по формуле P=gph (g = 9.8) и выводит, 
округляя по правилам математики.
*/
val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)
fun main(args: Array<String>){
  val p = scan.nextDouble()
  val h = scan.nextDouble()
    
  print(Math.round( 9.8 * p * h ))
}
