fun canConstruct(target: String, wordBank: Array<String>): Boolean {
    val table: Array<Boolean> = Array(target.length + 1) { false }
    table[0] = true

    for (i: Int in (0..target.length))
        if (table[i])
            for (word: String in wordBank)
                if (i + word.length <= target.length && target.substring(i, i + word.length) == word)
                    table[i + word.length] = true

    return table[target.length]
}

fun main(): Unit {
    println(canConstruct("abcdef", arrayOf("a", "ab", "bcd", "f", "def", "bc"))) // true
    println(canConstruct("skateboard", arrayOf("ska", "te", "boar", "ate", "sk", "at", "bo"))) // false
    println(canConstruct("abcdef", arrayOf("a", "ab", "bcd", "def", "b", "c"))) // true
}