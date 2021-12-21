function countConstruct(target, wordBank) {
    const table = Array(target.length + 1).fill(0);
    table[0]++

    for (let i = 0; i <= target.length; i++)
        for (let word of wordBank)
            if (target.substr(i, word.length) === word)
                table[i + word.length] += table[i]

    return table[target.length]
}

console.log(countConstruct("purple", ["purp", "p", "ur", "le", "purpl"]))
console.log(countConstruct("javascript", ["java", "scr", "it", "javascr", "script"]))
console.log(countConstruct("aaaaaaaaaaaaaaaaaaa", ["a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"]))
console.log(countConstruct("abcdef", ["a", "ab", "bcd", "f", "def", "bc"]))
console.log(countConstruct("skateboard", ["ska", "te", "boar", "ate", "sk", "at", "bo"]))
console.log(countConstruct("abcdef", ["a", "ab", "bcd", "def", "b", "c"]))