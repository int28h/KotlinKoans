/*
Считайте 5 слов, введенных через пробел, и выведите их в обратном порядке.

Sample Input:
kotlin java scala groovy ceylon

Sample Output:
ceylon groovy scala java kotlin
*/

// 1
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    print(scan.nextLine().split(" ").reversed().joinToString(separator=" "))
}

//2
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
       scan.nextLine().split(" ").reversed().forEach { 
        print(it + " ")
    }
}