fun canSum(targetSum: Int, numbers: Array<Int>): Boolean {
    if (targetSum < 0) return false;
    if (targetSum == 0) return true;

    numbers.forEach {
        if (canSum(targetSum - it, numbers)) return true
    }

    return false
}

fun main(vararg args: String): Unit {
    println(canSum(args[0].toInt(), arrayOf<Int>(14, 7)))
}