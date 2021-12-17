function bestSum(targetSum, numbers, memo = []) {
    if (targetSum in memo) return memo[targetSum]
    if (targetSum === 0) return []
    if (targetSum < 0) return null

    let shortestCombination = null

    for (let num of numbers) {
        const remainderResult = bestSum(targetSum - num, numbers, memo)
        const currentCombination = remainderResult ?  [...remainderResult, num] : null
        
        if (shortestCombination === null
            || currentCombination
            && currentCombination.length < shortestCombination.length)
            shortestCombination = currentCombination
    }

    memo[targetSum] = shortestCombination
    return shortestCombination
}

console.log(bestSum(80, [5, 6, 3]))