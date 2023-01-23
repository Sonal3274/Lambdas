fun main() {
    val nums= listOf(1,2,3,4,5)
    println(isOdd(3))
    println(isOdd(2))

    val list=nums.filter (::isOdd) //Normal Function

    println(list)

    val listLambda = nums.filter { it%2 == 0} //Lambda Function for even numbers
    println(listLambda)
}

fun isOdd(a:Int):Boolean{
    return a%2 != 0
}