function howSum(targetSum, numbers) {
    if (targetSum === 0) return []
    if (targetSum < 0) return null

    for (let num of numbers) {
        const remainderResult = howSum(targetSum - num, numbers)
        if (remainderResult) return [num, ...remainderResult]
    }

    return null
}

console.log(howSum(71, [4, 7]))