function countConstruct(target, wordBank, memo = []) {
    if (memo[target]) return memo[target];
    if (target.length === 0) return 1;

    let count = 0;

    for (let word of wordBank) {
        if (target.startsWith(word)) {
            memo[target] = countConstruct(target.slice(word.length), wordBank, memo);
            count += memo[target];
        }
    }

    return count;
}

console.log(countConstruct("purple", ["purp", "p", "ur", "le", "purpl"]))
console.log(countConstruct("javascript", ["java", "scr", "it", "javascr", "script"]))
console.log(countConstruct("aaaaaaaaaaaaaaaaaaa", ["a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"]))