/*
Записан следующий код:

import java.util.Scanner

val scan = Scanner(System.`in`)

fun makeCatVoice(e: Cat){
    e.voice()
}
open class Cat {
    open fun voice() {
        println("Meow meow meow!!!")
    }
}
fun main(args: Array<String>) {
    val usualCat = Cat()        // Создаем обычного кота
    
    val name = scan.next()      // Считываем имя
    val homeCat = HomeCat(name) // Передаём в конструктор
    
    val num = scan.nextInt() 
    
    repeat(num) {
        makeCatVoice(usualCat)
        makeCatVoice(homeCat)
    }
}

Напишите класс HomeCat, наследующий класс Cat. 
Опишите конструктор, принимающий имя хозяина. 
Переопределите в классе метод voice(), чтобы кот говорил "Meoooooow! Feed me, name!", 
где name - имя хозяина

Sample Input:
Вася 5

Sample Output:
Meow meow meow!!!
Meoooooow! Feed me, Вася!
Meow meow meow!!!
Meoooooow! Feed me, Вася!
Meow meow meow!!!
Meoooooow! Feed me, Вася!
Meow meow meow!!!
Meoooooow! Feed me, Вася!
Meow meow meow!!!
Meoooooow! Feed me, Вася!
*/
class HomeCat(var name: String): Cat() {
    override fun voice(){
        println("Meoooooow! Feed me, $name!")
    }
}

/*
Описан класс Computer:

open class Computer {
    open fun enable() {
        println("вшшшшшшшшшш")
    }
}

Описано несколько разновидностей классов, наследующих его:

class QuantumComputer : Computer() { /* secret data */ }
class OldComputer     : Computer() { /* secret data */ }
class SuperComputer   : Computer() { /* secret data */ }
class SilentComputer  : Computer() { /* secret data */ }
class /* secret data */ : Computer () { /* secret data */ }

Напишите функцию enableMyComputer, принимающую аргумент типа Computer и включающую его.

Функция main скрыта.
*/
fun enableMyComputer(computer: Computer){
    computer.enable()
}

/*
Опишите класс Cat с методом play(), выводящим в консоль слово "мяу". 
Унаследуйте от него класс MyCat и переопределите метод play, чтобы он выводил в консоль слово "мяу!".

На тестовые данные внимания не обращайте.

Sample Input:
1100

Sample Output:
мяу
мяу
мяу!
мяу!
*/
open class Cat {
    open fun play() {
        println("мяу")
    }
}

class MyCat() : Cat() {
    override fun play(){
        println("мяу!")
    }
}

/*
Записан следующий код:

open class Cat {
    open fun hunt () {
        println("Я охочусь на мышей, ведь я кот!")
    }
}

Опишите класс HomeCat, наследующий класс Cat. 
Объявите метод hunt, принимающий переменную типа Boolean. 
Если её значение равно true, нужно вызвать метод hunt() класса-родителя. 
В обратном случае - вывести на экран строку "Ты че сдурел? Какие мыши? Иди корми меня, ленивая задница!"

Sample Input:
true false true

Sample Output:
Я охочусь на мышей, ведь я кот!
Ты че сдурел? Какие мыши? Иди корми меня, ленивая задница!
Я охочусь на мышей, ведь я кот!
*/
class HomeCat() : Cat() {
    fun hunt(b: Boolean){
        if(b) super.hunt()
        else println("Ты че сдурел? Какие мыши? Иди корми меня, ленивая задница!")
