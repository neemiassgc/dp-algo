fun gridTraveler(m: Int, n: Int): Int {
    val table: Array<Array<Int>> = Array(m + 1) { Array(n + 1) { 0 } }
    table[1][1] = 1

    for (i: Int in 0..m) {
        for (j: Int in 0..n) {
            if (j != n) table[i][j + 1] += table[i][j]
            if (i != m) table[i + 1][j] += table[i][j]
        }
    }

    return table[m][n]
}

fun main(vararg args: String) {
    when (args.size) {
        2 -> println(gridTraveler(args[0].toInt(), args[1].toInt()))
        else -> println(gridTraveler(3, 3))
    }
    
}