// m = targetSum
// n = numbers.length
// O(nm) time
// O(m) space
function canSum(targetSum, numbers) {
    const table = Array(targetSum + 1).fill(false)
    table[0] = true

    for (let i = 0; i <= targetSum; i++) {
        if (table[i])
            for (let num of numbers)
                table[i + num] = true
    }

    return table[targetSum]
}

console.log(canSum(514, [5, 3, 8, 12, 11]))