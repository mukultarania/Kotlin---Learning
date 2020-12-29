/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    var animal = 121
    var ans = when(animal){
        in 1..10 -> "Natural number less than equal to 10" //Range for 1<=n<=10
        11 -> "11"
        12 -> "12"
        in 13..19 -> "Teen Number"
        else -> "Greater than equal to 20"
    }
    
    println(ans)
}