let n = parseInt(prompt("Entrez un nombre: "));

for (let i = 1; i <= n; i++) {
  if (i % 3 === 0 && i % 5 === 0) {
    console.log("fizzbuzz");
    document.write(`<p> ${i} est un multiple de 3 et 5 ==> fizzbuzz</p>`);
  } else if (i % 3 === 0) {
    console.log("fizz");
    document.write(`<p>${i} est un multiple de 3 ==> fizz</p>`);
  } else if (i % 5 === 0) {
    console.log("buzz");
    document.write(`<p>${i} est un multiple de 5 ==> buzz</p>`);
  } else {
    console.log(i);
    document.write(`<p>${i} n'est pas un multiple de 3 et de 5: ${i}</p>`);
  }
}
