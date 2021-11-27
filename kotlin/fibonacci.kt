fun fib(n: Long, memo: HashMap<Long, Long> = hashMapOf()): Long {
    if (memo.containsKey(n)) return memo.getOrElse(n) { 0 }
    if (n <= 1) return 1
    memo[n] = fib(n - 1, memo) + fib(n - 2, memo)
    return memo.getOrElse(n) { 0 }

}

fun main() {
    println(fib(50))
}