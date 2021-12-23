function allConstruct(target, wordBank) {
    const table = Array(target.length + 1).fill().map(() => [])
    table[0] = [[]]

    for (let i = 0; i <= target.length; i++)
        for (let word of wordBank)
            if (target.substr(i, word.length) === word)
                table[i + word.length].push(...table[i].map((way) => [...way, word]))

    return table[target.length]
}

console.log(allConstruct("purple", ["purp", "p", "ur", "le", "purpl"]))
console.log(allConstruct("javascript",
["java", "scr", "it", "javascr", "script", "vas", "crit", "cr", "s", "pt", "r", "ava", "av", "ja", "j", "sc", "va", "cript"]))
console.log(allConstruct("abcdef", ["a", "ab", "bcd", "f", "def", "bc"]))
console.log(allConstruct("skateboard", ["ska", "te", "boar", "ate", "sk", "at", "bo"]))
console.log(allConstruct("abcdef", ["a", "ab", "bcd", "def", "b", "c"]))
console.log(allConstruct("aaaaaaaaaaaaaaaaaaa", ["a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"]))