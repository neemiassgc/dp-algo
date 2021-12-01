const canSum = (target, numbers) => {
    if (target < 0) return false;
    if (target === 0) return true;

    for (let i of numbers)
        if (canSum(target - i, numbers)) return true

    return false
}

console.log(canSum(3000, [7, 14]))