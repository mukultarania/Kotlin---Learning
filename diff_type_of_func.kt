/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    //Function Overloading
	println(add(1,2))
    println(add(1.0, 2.0))
    println(add("1.0", "2.0"))
    
    /* Named Arguments
    print(a = 2, b=3)
    is same as 
    print(b = 3, a =2)
    */
    
    //Store function in a variable
    var fn = ::display
    println(fn("Ten-", "10"))
}

fun add(a: Int, b: Int) = a+b

fun add(a: Double, b: Double) = a+b

fun add(a: String, b: String) = a+b

fun display(a: String, b: String) = a+b

