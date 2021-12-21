function canConstruct(target, wordBank) {
    const table = Array(target.length + 1).fill(false)
    table[0] = true

    for (let i = 0; i <= target.length; i++)
        if (table[i])
            for (let word of wordBank)
                if (target.substr(i, word.length) === word)
                    table[i + word.length] = true

    return table[target.length]
}

console.log(canConstruct("abcdef", ["a", "ab", "bcd", "f", "def", "bc"])) // true
console.log(canConstruct("skateboard", ["ska", "te", "boar", "ate", "sk", "at", "bo"])) // false
console.log(canConstruct("abcdef", ["a", "ab", "bcd", "def", "b", "c"])) // true