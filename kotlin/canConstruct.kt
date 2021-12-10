fun canConstruct(target: String, wordBank: Array<String>): Boolean {
    if (target.isEmpty()) return true;

    wordBank.forEach { word ->
        if (target.startsWith(word)) {
            val suffix: String = target.slice(word.length..(target.length - 1))
            if (canConstruct(suffix, wordBank)) return true
        }
    }

    return false
}

fun main(): Unit {
    println(canConstruct("skateboard", arrayOf("bo", "rd", "ate", "t", "ska", "sk", "boar")))
}