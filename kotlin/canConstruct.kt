fun canConstruct(target: String, wordBank: Array<String>, memo: MutableList<String> = mutableListOf()): Boolean {
    if (target.isEmpty()) return true;
    if (target in memo) return false

    wordBank.forEach { word ->
        if (target.startsWith(word)) {
            val suffix: String = target.slice(word.length..(target.length - 1))
            val result: Boolean = canConstruct(suffix, wordBank, memo)
            
            if (result) return true

            memo += target
        }
    }


    memo += target
    return false
}

fun main(): Unit {
    println(canConstruct("skateboard", arrayOf("bo", "rd", "ate", "t", "ska", "sk", "boar")))
    println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
        arrayOf("e", "ee", "eee", "eeee", "eeeee", "eeeeee")))
}