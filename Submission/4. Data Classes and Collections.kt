fun main() {

    // TODO 1
    val user = mapOf<String, String>(
            "name" to "John",
            "age" to "23",
            "address" to "St. Petersburg"
    )

    // TODO 2
    val name = user.getValue("name")
    val age = user.getValue("age")
    val address = user.getValue("address")

    // TODO 3
    val output1 = """
        User
        Name: $name
        Age: $age
        Address: $address
        """.trimIndent()
    println(output1)