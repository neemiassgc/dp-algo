fun howSum(targetSum: Int, numbers: List<Int>): List<Int>? {
    if (targetSum == 0) return emptyList<Int>()
    if (targetSum < 0) return null

    numbers.forEach() {
        val remainderResult: List<Int>? = howSum(targetSum - it, numbers)
        if (remainderResult != null) return remainderResult + it
    }

    return null;
}

fun main(vararg args: String): Unit {
    println(howSum(args[0].toInt(), mutableListOf<Int>(4, 3, 5)))
}