/**
 * Rewrite the following Java code to Kotlin:
 * 
 * public class Person {
 *     private final String name;
 *     private final int age;
 * 
 *     public Person(String name, int age) {
 *        this.name = name;
 *        this.age = age;
 *     }
 * 
 *     public String getName() {
 *         return name;
 *     }
 * 
 *     public int getAge() {
 *         return age;
 *     }
 * }
 * 
 * Then add an annotation data to the resulting class. This annotation means the compiler will generate a bunch of useful methods in this class: equals/hashCode, toString and some others. The getPeople function should start to compile.
 * 
 * Read about classes, properties and data classes.
 * https://kotlinlang.org/docs/reference/data-classes.html
 * http://kotlinlang.ru/docs/reference/data-classes.html
 */
data class Person(val name: String, val age: Int)