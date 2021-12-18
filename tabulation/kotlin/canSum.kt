fun canSum(targetSum: Int, numbers: Array<Int>): Boolean {
    val table: Array<Boolean> = Array(targetSum + 1) { false }
    table[0] = true

    for (i: Int in (0..targetSum)) {
        if (table[i]) {
            numbers.forEach {
                if (i + it <= targetSum) table[i + it] = true
            }
        }
    }

    return table[targetSum]
}

fun main(): Unit {
    println(canSum(303, arrayOf(5, 6, 7)))
}