fun canSum(targetSum: Int, numbers: Array<Int>, memo: HashMap<Int, Boolean> = HashMap()): Boolean {
    if (memo.containsKey(targetSum)) return memo[targetSum] ?: false
    if (targetSum < 0) return false;
    if (targetSum == 0) return true;

    numbers.forEach {
        memo[targetSum] = canSum(targetSum - it, numbers, memo)
        if (memo[targetSum] ?: false) return true
    }

    memo[targetSum] = false
    return false
}

fun main(vararg args: String): Unit {
    println(canSum(args[0].toInt(), arrayOf<Int>(14, 7)))
}