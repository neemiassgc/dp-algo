function canConstruct(target, wordBank) {
    if (target.length === 0) return true

    for (let word of wordBank) {
        if (target.startsWith(word)) {
            const suffix = target.substr(word.length)
            if(canConstruct(suffix, wordBank))
                return true
        }
    }

    return false
}

console.log(canConstruct("skateboard", ["bo", "rd", "ate", "t", "ska", "sk", "boar"]))
console.log(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
["e", "ee", "eee", "eeee", "eeeee", "eeeeee"]))