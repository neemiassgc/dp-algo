fun allConstruct(target: String, wordBank: Array<String>): List<List<String>> {
    if (target.isEmpty()) return listOf(listOf())

    val allWays: MutableList<List<String>> = mutableListOf()

    wordBank.forEach { word ->
        if (target.startsWith(word)) {
            val remainingWays: List<List<String>> = allConstruct(target.slice(word.length..(target.length - 1)), wordBank);
            val targetWays: List<List<String>> = remainingWays.map() { way -> listOf(word) + way }
            targetWays.forEach(allWays::add)
        }
    }

    return allWays
}

fun main(): Unit {
    println(allConstruct("purple", arrayOf("purp", "p", "ur", "le", "purpl")))
    println(allConstruct("strawberry", arrayOf("straw", "st", "ra", "w", "ber", "berry")))
    println(allConstruct("yellow", arrayOf("y", "ll", "o", "ow", "w", "e", "llow", "yel", "low", "ellow")))
    println(allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaf", arrayOf("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")))
}