fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val resultA = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)

    println("""
        ResultA is $resultA
        ResultB is $resultB
    """.trimIndent())
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): String {
    // TODO 1
   val va = valueA
   val vb = valueB
   val vc = valueC ?: 100
   val result = (va + (vb - vc))
    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int): String {
    return ("$result")
}