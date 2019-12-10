/*
Напишите программу, которая считывает число и выводит "A", если оно двузначное, 
"B", если оно трёхзначное 
и "C" во всех остальных случаях.

Гарантируется, что число положительное.

Sample Input:
5

Sample Output:
C
*/

val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.nextInt()

    when(a.toString().length) {
        3 -> print("B")
        2 -> print ("A")
        else -> print ("C")
    }
}

/*
Напишите программу, которая считывает строку и выводит:

    "A", если её длина больше 0 и меньше 11;
    "B", если её длина равна 20
    "C", если её длина равна 15
    "D" во всех остальных случаях.

Использовать условный опреатор if-else запрещено.

Sample Input:
a

Sample Output:
A
*/

val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.nextInt()

    when(a.toString().length) {
        in(0..11) -> print("A")
        20 -> print ("B")
        15 -> print("C")
        else -> print ("D")
    }
}