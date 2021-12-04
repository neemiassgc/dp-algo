fun howSum(targetSum: Int, numbers: List<Int>, memo: HashMap<Int, List<Int>?> = hashMapOf()): List<Int>? {
    if (targetSum in memo) return memo[targetSum]
    if (targetSum == 0) return emptyList()
    if (targetSum < 0) return null

    numbers.forEach() {
        val remainderResult: List<Int>? = howSum(targetSum - it, numbers, memo)
        memo[targetSum] = remainderResult
        if (remainderResult != null) return remainderResult + it
    }

    memo[targetSum] = null
    return null
}

fun main(vararg args: String): Unit {
    println(howSum(args[0].toInt(), mutableListOf<Int>(4, 3, 5)))
}