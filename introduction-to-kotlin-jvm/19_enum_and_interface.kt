/*
Василий Иванович устроился на работу водителем. Сегодня ему поручили отвезти начальника крупной
компании, уточнив, что точного адреса пассажир, к сожалению, не знает, но он помнит дорогу 
и будет указывать водителю направление.

Также Василий Иванович является большим любителем песен исполнителя Малерия Веладзе, и вот ведь удача:
так совпало, что именно сегодня по радио целый день будут крутить его песни. Василий Иванович считает,
что любимая музыка намного важнее работы, но терять работу просто так он тоже не хочет. 
Поэтому он обратился в компанию по разработке приложений ООО "Мы платим за объем кода" 
для разработки ПО навигатора. Программа должна определить, можно ли доставить начальника 
в конечную точку, не покидая зоны действия радиостанции.

Считайте, что Василий Иванович изначально находится рядом с радиостанцией (на расстоянии в 0м от неё).

Описано перечисление Direction:

enum class Direction {
    UP, RIGHT, DOWN, LEFT
}

Опишите класс Navigator, имеющий единственный метод со следующей сигнатурой:

fun checkPath(path: Array<Direction>, radius: Int): Boolean {

}

Где path - последовательность указаний, а radius - дальность работы радиостанции.
Функция должна вернуть true, если довезти начальника можно и false в обратном случае
(если машина находится на границе зоны охвата, то сигнал до неё достаёт)

Печатать в консоль ничего не нужно.

Пример:
path = arrayOf(Direction.UP, Direction.LEFT, Direction.LEFT, Direction.UP, Direction.LEFT, Direction.UP, 
Direction.RIGHT, Direction.UP, Direction.UP, Direction.UP, Direction.RIGHT)
radius = 5

Результат - false
*/
class Navigator(){
    fun checkPath(path: Array<Direction>, radius: Int): Boolean {
        var x:Int = 0
        var y:Int = 0
        
        path.forEach {
            when(it){
                Direction.UP -> y+=1
                Direction.DOWN -> y-=1
                
                Direction.RIGHT -> x+=1
                Direction.LEFT -> x-=1
            }
            if(Math.abs(x) > radius || Math.abs(y) > radius) return false
        }
        
        if(Math.abs(x) > radius || Math.abs(y) > radius) return false
        return true
    }
}

/*
Повторяем условие предыдущей задачи с некоторыми изменениями.

    Описан класс Position:

    class Position(var x: Int, var y: Int)

    Класс Navigator из предыдущего задания переименован в класс SimpleNavigator, теперь нужно описать его
    Описан абстрактный класс Navigator:

    abstract class Navigator(val pos: Position) {
        abstract fun checkPath(path: Array<Direction>, radius: Int) : Boolean
    }

    Обратите внимание, что начальное положение водителя теперь определено переменной pos.
    * Класс SimpleNavigator должен наследовать класс Navigator.
    Теперь при каждом обновлении позиции водителя должно выполняться обновление переменной pos:

    pos.x = newX
    pos.y = newY

Уточнение: Direction.UP и Direction.DOWN перемещают машину по координате 
Y (DOWN -> y--; UP -> y++), RIGHT и LEFT - по X.
Уточнение: навигатор должен продолжать работу после выхода машины из поля действия радиостанции,
переменная pos должна обновляться.
*/
class SimpleNavigator(pos: Position) : Navigator(pos) {
    override fun checkPath(path: Array<Direction>, radius: Int): Boolean {
        var isExit: Boolean = false

        path.forEach {
            if (Math.abs(pos.x) > radius || Math.abs(pos.y) > radius) isExit = true
            when (it) {
                Direction.UP -> pos.y++
                Direction.DOWN -> pos.y--
                
                Direction.RIGHT -> pos.x++
                Direction.LEFT -> pos.x--
            }
        }
        if (Math.abs(pos.x) > radius || Math.abs(pos.y) > radius) isExit = true
        
        return !isExit
    }
}

/*
Создайте класс StorableTransaction, реализующий интерфейс Storable и наследующий класс Transaction:

enum class StoreStatus {
    OK, ALREADY_STORED, DENY
}
interface Storable {
    fun canStore() : StoreStatus
    fun store() : String
    fun unstore()
}
abstract class Transaction(var sum: Int, var number: Int) {
    abstract fun process() : String
}

Класс должен отвечать следующим требованиям:

    Функция process() должна возвращать строку следующего вида:

    Processing transaction #{number} ({sum}$)

    Где {number} и {sum} - соответствующие переменные.
    Функция store() должна возвращать строку следующего вида:

    Transaction (number={number}, sum={sum})

    Где {number} и {sum} - соответствующие переменные.
    Функция canStore() должна возвращать:
    - ALREADY_STORED, если уже был вызван метод store()
    - иначе DENY, если транзакция уже была выполнена (был вызван метод process())
    - иначе OK
    При выполнении функции unstore() на сохраненном объекте сохранение должно сбрасываться 
	(canStore() тогда должен возвращать OK)
    Конструктор класса Transaction должен быть сохранён.

Пример использования методов класса:

val st = StorableTransaction(100,2)
println(st.process())                //Processing transaction #2 (100$)
println(st.canStore())               //DENY
println(st.store())                  //Transaction (number=2, sum=100)
println(st.canStore())               //ALREADY_STORED
st.unstore()
println(st.canStore())               //OK
val st1 = StorableTransaction(400,5)
println(st1.process())               //Processing transaction #5 (400$)
println(st1.canStore())              //DENY
println(st.canStore())               //OK

Примечание:
Тесты открыты для того, чтобы вы могли видеть ошибки в решении. На входн﻿ые данные внимание обращать не нужно.
*/
class StorableTransaction(sum: Int, number: Int) : Storable, Transaction(sum, number) {
    var isStoreCalled: Boolean = false
    var isProcessCalled: Boolean = false
    
    override fun process(): String {
        this.isProcessCalled = true
        return "Processing transaction #$number ($sum$)"
    }
    
    override fun store(): String {
        this.isStoreCalled = true
        return "Transaction (number=$number, sum=$sum)"
    }
    
    override fun unstore() {
        this.isStoreCalled = false
    }
    
    override fun canStore(): StoreStatus {
        if (isStoreCalled) return StoreStatus.ALREADY_STORED
        else if (isProcessCalled) return StoreStatus.DENY
        else return StoreStatus.OK
    }
}
