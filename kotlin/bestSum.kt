fun bestSum(targetSum: Int, numbers: List<Int>): List<Int>? {
    if (targetSum == 0) return emptyList()
    if (targetSum < 0) return null

    var shortestCombination: List<Int>? = null

    numbers.forEach() {
        val remainderResult: List<Int>? = bestSum(targetSum - it, numbers)
        val currentCombination: List<Int>? = remainderResult?.plus(it)

        if (shortestCombination == null
            || currentCombination != null
            && currentCombination.size < (shortestCombination as List).size)
            shortestCombination = currentCombination        
    }

    return shortestCombination
}

fun main(vararg args: String): Unit {
    println(bestSum(args[0].toInt(), mutableListOf<Int>(4, 8, 5)))
}