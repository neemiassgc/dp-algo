fun bestSum(targetSum: Int, numbers: List<Int>, memo: HashMap<Int, List<Int>?> = HashMap()): List<Int>? {
    if (memo.containsKey(targetSum)) return memo[targetSum]
    if (targetSum == 0) return emptyList()
    if (targetSum < 0) return null

    var shortestCombination: List<Int>? = null

    numbers.forEach() {
        val remainderResult: List<Int>? = bestSum(targetSum - it, numbers, memo)
        val currentCombination: List<Int>? = remainderResult?.plus(it)

        if (shortestCombination == null
            || currentCombination != null
            && currentCombination.size < (shortestCombination as List).size)
            shortestCombination = currentCombination        
    }

    memo[targetSum] = shortestCombination
    return shortestCombination
}

fun main(vararg args: String): Unit {
    println(bestSum(args[0].toInt(), mutableListOf<Int>(4, 8, 5)))
}