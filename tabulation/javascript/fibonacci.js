function fib(n) {
    const table = new Array(n + 1).fill(0)
    table[1] = 1

    for (let idx = 0; idx <= n; idx++) {
        table[idx + 1] += table[idx]
        table[idx + 2] += table[idx]
    }

    return table[n]
}

console.log(fib(33))