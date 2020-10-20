const fibbonaci = n => (n === 1 || n === 2) ? 1 : fibbonaci(n - 1) + fibbonaci(n - 2)

for (let i = 1; i < 20; i++) {
    console.log(fibbonaci(i))
}