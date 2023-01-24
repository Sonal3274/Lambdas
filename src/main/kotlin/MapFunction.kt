

fun main() {
    val nums = listOf(1,2,3,4,5)

    val userList = listOf(
        User(1,"A"),
        User(2,"B"),
        User(3,"C")

    )

    val list=nums.map { it*it }

    println(list)

    val paidUserList = userList.map {
        PaidUser(it.id, it.name, "Paid")
    }

    println(paidUserList)
}
data class User(val id: Int, val name: String)
data class PaidUser(val id:Int, val name:String, val type:String)