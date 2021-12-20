function bestSum(targetSum, numbers) {
    const table = Array(targetSum + 1).fill(null)
    table[0] = []

    for (let i = 0; i <= targetSum; i++) {
        if (table[i]) {
            for (num of numbers) {
                const candidateConbination = [...table[i], num]
                if (!table[i + num] || candidateConbination.length < table[i + num].length)
                    table[i + num] = candidateConbination
            }
        }
    }

    return table[targetSum]
}


console.log(bestSum(7, [2, 3]))
console.log(bestSum(57, [4, 6]))
console.log(bestSum(134, [4, 6]))