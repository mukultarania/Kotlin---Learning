/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    println("ADD 5+5 "+add(5,5))
    println("EVEN or ODD 5")
    even_odd(5)
}

// Default Arguments
// Parameters is of Val type
fun add(num1: Int = 1, num2: Int = 1):Int
{
    return num1+num2
}

/**
* Inline function and Unit as a return type
* fun add(num1: Int, num2 Int) = num1+num2 
*/


fun even_odd(num1: Int){
    val res = if(num1%2 == 0) "EVEN" else "ODD"
    println(res)
}