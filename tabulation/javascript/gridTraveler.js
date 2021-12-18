function gridTraveler(m, n) {
    const table = Array(m + 1).fill(0).map(() => Array(n + 1).fill(0))
    table[1][1] = 1
    
    for (let i = 0; i <= m; i++) {
        for (let j = 0; j <= n; j++) {
            if (j !== n) table[i][j + 1] += table[i][j]
            if (i !== m) table[i + 1][j] += table[i][j]
        }
    }

    return table[m][n]
}

console.log(gridTraveler(8, 18))
console.log(gridTraveler(4, 4))
console.log(gridTraveler(3, 3))
console.log(gridTraveler(18, 18))