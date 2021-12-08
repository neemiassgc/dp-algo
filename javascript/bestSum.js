function bestSum(targetSum, numbers) {
    if (targetSum === 0) return []
    if (targetSum < 0) return null

    let shortestCombination = null

    for (let num of numbers) {
        const remainderResult = bestSum(targetSum - num, numbers)
        const currentCombination = remainderResult ?  [...remainderResult, num] : null
        
        if (shortestCombination === null
            || currentCombination
            && currentCombination.length < shortestCombination.length)
            shortestCombination = currentCombination
    }

    return shortestCombination
}

console.log(bestSum(80, [5, 6, 3]))