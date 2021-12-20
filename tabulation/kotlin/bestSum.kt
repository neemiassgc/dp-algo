fun bestSum(targetSum: Int, numbers: Array<Int>): List<Int>? {
    val table: Array<List<Int>?> = Array(targetSum + 1) { null }
    table[0] = listOf()

    (0..targetSum).forEach {
        if (table[it] != null) {
            numbers.forEach { num ->
                val candidateCombination = table[it]!!.plus(num)
                if (it + num <= targetSum && (table[it + num] == null
                || candidateCombination.size < table[it + num]!!.size))
                    table[it + num] = candidateCombination
            }
        }
    }

    return table[targetSum]
}

fun main(): Unit {
    println(bestSum(7, arrayOf(2, 3)))
    println(bestSum(51, arrayOf(4, 7, 8)))
    println(bestSum(71, arrayOf(6, 9)))

}