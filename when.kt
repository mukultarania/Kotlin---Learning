/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    val animal = "Dog"
    val ans = when(animal){
        "Horse"->"Animal is Horse"
        "Cat"->"Animal is Cat"
        "Dog"->"Animal is Dog"
        else -> "Animal not found"
    }
    
    println(ans)
}