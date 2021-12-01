const canSum = (target, numbers, memo = {}) => {
    if (target in memo) return memo[target]
    if (target < 0) return false;
    if (target === 0) return true;

    for (let i of numbers) {
        memo[target] = canSum(target - i, numbers, memo)
        if (memo[target]) return true
    }

    return memo[target] = false
}

console.log(canSum(3553, [7, 14, 28]))