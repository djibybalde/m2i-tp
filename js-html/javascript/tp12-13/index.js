let table = [];

const len = parseInt(prompt(`Entrez la taille du tableau:`));

for (let i = 0; i < len; i++) {
  table.push(parseInt(prompt(`Entrez l'élément ${i + 1} du tableau: `)));
}

let sum = 0;
for (i in table) {
  sum += table[i];
}

document.write(`
  <p>Tableau: [${table}]</p>
  <p>Somme: ${sum}</p>
  <p>Moyenne: ${sum / table.length}</p>
`);
