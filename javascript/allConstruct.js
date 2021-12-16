function allConstruct(target, wordBank, memo = []) {
    if (target in memo) return memo[target];
    if (target.length === 0) return [[]]

    let allWays = []

    for (let word of wordBank) {
        if (target.startsWith(word)) {
            const rest = allConstruct(target.substring(word.length), wordBank, memo)
            const targetWays = rest.map(way => [word, ...way])
            allWays.push(...targetWays)
        }
    }

    memo[target] = allWays
    return allWays
}

console.log(allConstruct("purple", ["purp", "p", "ur", "le", "purpl"]))
console.log(allConstruct("abcdef", ["ab", "abc", "cd", "def", "abcd", "ef", "c"]))
console.log(allConstruct("skateboard", ["bo", "rd", "ate", "t", "ska", "sk", "boar", "skate"]))
console.log(allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz", ["a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"]))