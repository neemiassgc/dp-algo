function gridTraveler(m, n, memo = {}) {
    const key = `${m},${n}`

    if (memo[key]) return memo[key]
    if (m == 1 && n == 1) return 1
    if (m == 0 || n == 0) return 0

    memo[key] = gridTraveler(m - 1, n, memo) + gridTraveler(m, n - 1, memo)
    return memo[key]
}

console.log(gridTraveler(18, 18))