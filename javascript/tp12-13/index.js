const table = [2, 3, 5, 0];
let sum = 0;
for (i in table) {
  sum += table[i];
}

document.write(`
  <p>Tableau: [${table}]</p>
  <p>Somme: ${sum}</p>
  <p>Moyenne: ${sum / table.length}</p>
`);
