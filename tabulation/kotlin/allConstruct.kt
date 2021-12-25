fun allConstruct(target: String, workBank: Array<String>): List<List<String>> {
    val table: Array<List<List<String>>> = Array(target.length + 1) { listOf() }
    table[0] = listOf(listOf())

    for (i: Int in 0..target.length) {
        for (word: String in workBank) {
            if (i + word.length <= target.length && target.substring(i, i + word.length) == word) {
                val upToDateCombinations: List<List<String>> = table[i].map { it + word }
                table[i + word.length] += upToDateCombinations
            }
        }
    }

    return table[target.length]
}

fun main(): Unit {
    println(allConstruct("purple", arrayOf("purp", "p", "ur", "le", "purpl")))
    println(allConstruct("javascript",
    arrayOf("java", "scr", "it", "javascr", "script", "vas", "crit", "cr", "s", "pt", "r", "ava", "av", "ja", "j", "sc", "va", "cript")))
    println(allConstruct("abcdef", arrayOf("a", "ab", "bcd", "f", "def", "bc")))
    println(allConstruct("skateboard", arrayOf("ska", "te", "boar", "ate", "sk", "at", "bo")))
    println(allConstruct("abcdef", arrayOf("a", "ab", "bcd", "def", "b", "c")))
    println(allConstruct("aaaaaaaaaaaaaaa", arrayOf("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")))
}