/* Lambda Expression:
* Lambdas are anonymous functions.
* In lambda, last line defines the return type.
* */

fun main() {
    var fn : (a:Int, b:Int) -> Int = ::sum
    val lambda1 = {x:Int, y:Int -> x+y} //Single line lambda expression
    val multiline = {
        println("Hello lambda")
        val a:Int = 2+3
        "hello kotlin"
                2
    }

    println(multiline())
}

fun sum(a: Int, b: Int): Int = a + b

fun calculator (a:Int, b:Int, op:(Int,Int) -> Int):Int{
    return op(a,b)
}