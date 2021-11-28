fun gridTraveler(n: Long, m: Long, memo: HashMap<Pair<Long, Long>, Long> = hashMapOf()): Long {
    val key: Pair<Long, Long> = Pair(n, m)
    if (memo.containsKey(key)) return memo.getOrElse(key) { 0L }
    if (memo.containsKey(Pair(m, n))) return memo.getOrElse(Pair(m, n)) { 0L }
    if (n == 1L && m == 1L) return 1;
    if (n == 0L || m == 0L) return 0;
    
    memo[key] = gridTraveler(n - 1, m, memo) + gridTraveler(n, m - 1, memo)
    return memo.getOrElse(key) { 0L }
}

fun main(): Unit {

    println(gridTraveler(20, 32))
}