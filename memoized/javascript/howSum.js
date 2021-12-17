function howSum(targetSum, numbers, memo = {}) {
    if (targetSum in memo) return memo[targetSum]
    if (targetSum === 0) return []
    if (targetSum < 0) return null

    for (let num of numbers) {
        const remainderResult = howSum(targetSum - num, numbers)
        memo[targetSum] = remainderResult
        if (remainderResult) return [...remainderResult, num]
    }

    memo[targetSum] = null
    return null
}

console.log(howSum(300, [4, 7]))