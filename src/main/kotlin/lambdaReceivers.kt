fun main() {
    val person = Person("John", 25)

    // Using the "with" function
    with(person) {
        name = "Jane"
        age = 30
    }
    println(person) // Person(name=Jane, age=30)

    // Using the "apply" function
    person.apply {
        name = "Bob"
        age = 35
    }
    println(person) // Person(name=Bob, age=35)
}

data class Person(var name: String, var age: Int)
