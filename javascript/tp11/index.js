let number1 = parseInt(prompt("Entrez le premier nombre de la table: "));
let number2 = parseInt(prompt("Entrez le dernier nombre de la table: "));
let start = parseInt(prompt("Entrez le premier nombre à multiplier: "));
let stop_ = parseInt(prompt("Entrez le dernier nombre à multiplier: "));

for (let i = start; i <= stop_; i++) {
  document.write("<p>");
  for (let j = number1; j <= number2; j++) {
    document.write(
      `<span class="table">
      <span class="number">${j}</span>&times;<span class="multiple">${i}</span> = <span>${
        j * i
      }; </span>
      </span>`
    );
  }
  document.write("</p>");
}
