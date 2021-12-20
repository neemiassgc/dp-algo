fun howSum(targetSum: Int, numbers: Array<Int>): List<Int>? {
    val table: Array<List<Int>?> = Array(targetSum + 1) { null }
    table[0] = listOf()

    for (i: Int in (0..targetSum)) {
        if (table[i] != null) {
            for (num: Int in numbers)
                if(i + num <= targetSum)
                    table[i + num] = table[i]?.plus(num)
        }
    }

    return table[targetSum]
}

fun main(): Unit {
    println(howSum(7, arrayOf(2, 3)))
    println(howSum(47, arrayOf(6, 2)))
}