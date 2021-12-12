fun countConstruct(target: String, wordBank: Array<String>): Int {
    if (target.isEmpty()) return 1

    var count = 0;

    wordBank.forEach { word ->
        if (target.startsWith(word))
            count += countConstruct(target.substring(word.length), wordBank)
    }

    return count
}

fun main(): Unit {
    println(countConstruct("purple", arrayOf("purp", "p", "ur", "le", "purpl")))
}