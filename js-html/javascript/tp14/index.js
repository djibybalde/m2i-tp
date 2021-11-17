const table = new Array();

const lenght = parseInt(prompt("Entrez la taille du tableau: "));
for (let i = 1; i <= lenght; i++) {
  table.push(parseInt(prompt(`Entrez l'élément ${i} du tableau: `)));
}

const minMax = [0, 0];
for (let i = 0; i < table.length; i++) {
  if (table[i] < minMax[0]) {
    minMax[0] = table[i];
  }
  if (table[i] > minMax[1]) {
    minMax[1] = table[i];
  }
}
document.write(`
  <p>Tableau: [${table}]</p>
  <p>Le plus grand nombre du tableau est ${minMax[1]}</p>
  <p>Le plus petit nombre du tableau est ${minMax[0]}</p>
`);
console.log(minMax);
