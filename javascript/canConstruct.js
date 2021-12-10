function canConstruct(target, wordBank, memo = {}) {
    if (target.length === 0) return true
    if (target in memo) return memo[target]
    
    for (let word of wordBank) {
        if (target.startsWith(word)) {
            const suffix = target.substr(word.length)
            memo[target] = canConstruct(suffix, wordBank, memo)

            if (memo[target]) return true
        }
    }

    memo[target] = false
    return false
}

console.log(canConstruct("skateboard", ["bo", "rd", "ate", "t", "ska", "sk", "boar"]))
console.log(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
["e", "ee", "eee", "eeee", "eeeee", "eeeeee"]))