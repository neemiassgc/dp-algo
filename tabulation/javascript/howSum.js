function howSum(targetSum, numbers) {
    const table = Array(targetSum + 1).fill(null)
    table[0] = []

    for (let i = 0; i <= targetSum; i++) {
        if (table[i])
            for (let num of numbers)
                table[i + num] = [num, ...table[i]]
    }

    return table[targetSum]
}

console.log(howSum(7, [2, 3]))
console.log(howSum(51, [2, 4]))