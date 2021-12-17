fun allConstruct(target: String, wordBank: Array<String>, memo: HashMap<String, List<List<String>>> = hashMapOf()): List<List<String>> {
    if (memo.containsKey(target)) return memo[target]!!
    if (target.isEmpty()) return listOf(listOf())

    val allWays: MutableList<List<String>> = mutableListOf()

    wordBank.forEach { word ->
        if (target.startsWith(word)) {
            val rest: List<List<String>> = allConstruct(target.slice(word.length..(target.length - 1)), wordBank, memo);
            val targetWays: List<List<String>> = rest.map() { way -> listOf(word) + way }
            targetWays.forEach(allWays::add)
        }
    }

    memo[target] = allWays
    return allWays
}

fun main(): Unit {
    println(allConstruct("purple", arrayOf("purp", "p", "ur", "le", "purpl")))
    println(allConstruct("strawberry", arrayOf("straw", "st", "ra", "w", "ber", "berry")))
    println(allConstruct("yellow", arrayOf("y", "ll", "o", "ow", "w", "e", "llow", "yel", "low", "ellow")))
    println(allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaf", arrayOf("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")))
    println(allConstruct("", arrayOf("ab", "ba")))
}