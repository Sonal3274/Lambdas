/* Lambda Expression:
* Lambdas are anonymous functions.
* In lambda, last line defines the return type.
* */

fun main() {
    var fn : (a:Int, b:Int) -> Int = ::sum
    val lambda1 = {x:Int, y:Int -> x+y} //Single line lambda expression
/*    val multiline = {
        println("Hello lambda")
        val a:Int = 2+3
        "hello kotlin"
                2
    }

    multiline()
    println(multiline())*/

    val lambdaFun = {
//Variations of Lambda expression

        val singleParamlambda = { x: Int -> x * x }
        val lambda2: (Int) -> Int = { x -> x * x }

        println(singleParamlambda)
        println(lambda2)

        val sayHi = { msg: String -> println("Hello $msg") }
        val sayHi2: (String) -> Unit = { msg -> println("Hello $msg") }

        println(sayHi)
        println(sayHi2)
    }

    //lambdaFun()
    println(lambdaFun())
}

fun sum(a: Int, b: Int): Int = a + b

fun calculator (a:Int, b:Int, op:(Int,Int) -> Int):Int{
    return op(a,b)
}