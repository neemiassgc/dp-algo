fun countConstruct(target: String, wordBank: Array<String>, memo: HashMap<String, Int> = hashMapOf()): Int {
    if (memo.containsKey(target)) return memo[target]!!
    if (target.isEmpty()) return 1

    var count = 0;

    wordBank.forEach { word ->
        if (target.startsWith(word)) {
            memo[word] = countConstruct(target.substring(word.length), wordBank)
            count += memo[word]!!
        }
    }

    memo[target] = count
    return count
}

fun main(): Unit {
    println(countConstruct("purple", arrayOf("purp", "p", "ur", "le", "purpl")))
    println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeef",
        arrayOf("e", "ee", "eeee", "eeeee", "eeeeee", "eeeeeee", "eeeeeeee", "eeeeeeeee", "eeeeeeeeee")))
}