/*
* Predicates: Or a condition that returns TRUE or FALSE
* - "all" : Do all elements satisfy the predicate/condition?
* - "any" : Do any element in list satisfy the predicate?
* - "count" : Total elements that satisfy the predicate
* - "find" : Returns the FIRST element that satisfy predicate
*/

fun main() {
    val myNumbers = listOf(2,3,4,6,23,90)

    val check1 = myNumbers.all { it > 10 } //Are all the numbers greater than 10?
    println(check1)

    val check2 = myNumbers.any { it > 10 } //Do any of these numbers satisfy the predicate?
    println(check2)

    val check3 = myNumbers.count { it > 10 } //Number of elements that satisfy the predicate
    println(check3)

    val check4 = myNumbers.find { it > 10 } //Returns the first number that matches the predicate
    println(check4)
}