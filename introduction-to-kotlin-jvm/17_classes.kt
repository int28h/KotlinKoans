/*
Записан следующий код:

import java.util.Scanner

class Dog(name: String) {
    init {
        // Ваш код здесь
    }
}
val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val name = scan.next()
    val dog = Dog(name)
}

Ваша задача - написать код блока init, чтобы при создании нового объекта на экран печаталась 
строка следующего вида:

Создан новый объект типа Dog с именем <name>

Sample Input:
Лаврентий

Sample Output:
Создан новый объект типа Dog с именем Лаврентий
*/
init {
    println("Создан новый объект типа Dog с именем $name")
}

/*
Записан следующий код:

import java.util.Scanner

class Car() {
    fun ride(km: Int) {
        // Ваш код здесь
    }
}
val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val car = Car()
    car.ride(scan.nextInt())
}

Ваша задача - написать код функции ride, принимающей аргумент km и действующей так:

    Напечатать "Поехали!"
    Пока расстояние > 0, печатать: "Осталось N километров", где N - оставшееся расстояние
    В конце напечатать "Приехали!'
	
Sample Input:
3

Sample Output:
Поехали!
Осталось 3 километров
Осталось 2 километров
Осталось 1 километров
Приехали!
*/
fun ride(km: Int) {
    println("Поехали!")
    for(i in km downTo 1) println("Осталось $i километров")
    println("Приехали!")
}

/*
Записан следующий код:

import java.util.Scanner

val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    val cat = Cat(scan.next())
    val num = scan.nextInt()

    repeat(num) {
        cat.play()
    }
}

// Ваш код здесь


Напишите класс Cat с конструктором принимающим строку и одним методом play, выводящим сообщение:
Ура, со мной поиграли!
Конструктор должен выводить следующее сообщение:
Создан новый объект типа Cat с именем N
Где N - переданный конструктору параметр

Sample Input:
Барсик 
3

Sample Output:
Создан новый объект типа Cat с именем Барсик
Ура, со мной поиграли!
Ура, со мной поиграли!
Ура, со мной поиграли!
*/
class Cat(name: String) {
    init {
        println("Создан новый объект типа Cat с именем $name")
    }
    
    fun play(){
        println("Ура, со мной поиграли!")
    }
}

/*
Записан следующий код:

import java.util.Scanner

val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    val cat = Cat(scan.next())
    print("${cat.name} ")
    cat.name = scan.next()
    print(cat.name)
}

Ваша задача - написать код класса Cat, принимающего один параметр конструктора 
и имеющего поле name, инициализируемое в конструкторе

Sample Input:
Барсик Вася

Sample Output:
Барсик Вася
*/
class Cat (var name: String) {
}

/*
Напишите класс с именем Cat, имеющий:

    Первичный конструктор, который принимает поля age: Int и name: String
    Метод addAge(), не принимающий аргументов, который прибавляет 1 к полю age и печатает собщение:

    Теперь коту $name $age лет

    ﻿Где name и age - соответствующие переменные.
    Метод printName(), печатающий на экран сообщение:

    Кота зовут $name

    Где name - имя кота

Не обращайте внимания на входные данные.

Sample Input:

Барсик:5|11011

Sample Output:

Теперь коту Барсик 6 лет
Теперь коту Барсик 7 лет
Кота зовут Барсик
Теперь коту Барсик 8 лет
Теперь коту Барсик 9 лет
*/
class Cat (var age: Int, var name: String){
    fun addAge(){
        this.age += 1
        println("Теперь коту $name $age лет")
    }
    
    fun printName(){
        println("Кота зовут $name")
    }
}
