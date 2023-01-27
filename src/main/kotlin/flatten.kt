fun main() {
    val nestedList = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))
    try {
        val flatList = nestedList.flatten()
        println("Original nested list: $nestedList")
        println("Flattened list: $flatList")
    } catch (e: Exception) {
        println("An error occurred while flattening the list: ${e.message}")
    }
}
