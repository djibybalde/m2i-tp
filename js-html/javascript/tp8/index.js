let number = parseInt(prompt("Entrez un nombre: "));
document.write("[");
for (let i = number + 1; i <= number + 10; i++) {
  document.write(`<span>${i}, </span>`);
}
document.write("]");
