fun countConstruct(target: String, wordBank: Array<String>): Int {
    val table: Array<Int> = Array(target.length + 1) { 0 }
    table[0]++

    for (i: Int in (0..target.length))
        for (word: String in wordBank)
            if (i + word.length <= target.length && target.substring(i, i + word.length) == word)
                table[i + word.length] += table[i]

    return table[target.length]
}

fun main(): Unit {
    println(countConstruct("purple", arrayOf("purp", "p", "ur", "le", "purpl")))
    println(countConstruct("javascript", arrayOf("java", "scr", "it", "javascr", "script")))
    println(countConstruct("aaaaaaaaaaaaaaaaaaa", arrayOf("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")))
    println(countConstruct("abcdef", arrayOf("a", "ab", "bcd", "f", "def", "bc")))
    println(countConstruct("skateboard", arrayOf("ska", "te", "boar", "ate", "sk", "at", "bo")))
    println(countConstruct("abcdef", arrayOf("a", "ab", "bcd", "def", "b", "c")))
}