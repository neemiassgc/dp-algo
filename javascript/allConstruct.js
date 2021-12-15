function allConstruct(target, wordBank) {
    if (target.length === 0) return [[]]

    let allWays = []

    for (let word of wordBank) {
        if (target.startsWith(word)) {
            const suffixWays = allConstruct(target.substring(word.length), wordBank)
            const targetWays = suffixWays.map(way => [word, ...way])
            allWays.push(...targetWays)
        }
    }

    return allWays
}

console.log(allConstruct("purple", ["purp", "p", "ur", "le", "purpl"]))
console.log(allConstruct("abcdef", ["ab", "abc", "cd", "def", "abcd", "ef", "c"]))
console.log(allConstruct("skateboard", ["bo", "rd", "ate", "t", "ska", "sk", "boar", "skate"]))
console.log(allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaz", ["a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"]))