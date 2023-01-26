fun main() {
    val nestedList = listOf(listOf(1, 2), listOf(3, 4))
    val flattenedList = nestedList.flatMap { it }
    println(flattenedList) // prints [1, 2, 3, 4]
}
