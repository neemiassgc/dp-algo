fun fib(n: Int): Long {
    val table: Array<Long> = Array(n + 1) { 0L }
    table[1] = 1

    for (idx: Int in (0..n)) {
        table[idx + 1] += table[idx]
        if (idx == n - 1) break
        table[idx + 2] += table[idx]
    }

    return table[n]
}

fun main(vararg args: String): Unit {
    println(fib(if (args.size >= 1) args[0].toInt() else 7))
}