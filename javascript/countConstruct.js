function countConstruct(target, wordBank) {
    if (target.length === 0) return 1;

    let count = 0;

    for (let word of wordBank)
        if (target.startsWith(word))
            count += countConstruct(target.substr(word.length), wordBank);

    return count;
}

console.log(countConstruct("purple", ["purp", "p", "ur", "le", "purpl"]))