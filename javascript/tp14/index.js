const table = new Array();
const lenght = parseInt(prompt("Entrez la taille du tableau: "));
for (let i = 1; i <= lenght; i++) {
  table.push(parseInt(prompt(`Entrez l'élément ${i} du tableau: `)));
}

document.write(`
  <p>Tableau: [${table}]</p>
  <p>Le plus grand nombre du tableau est ${Math.max(...table)}</p>
  <p>Le plus petit nombre du tableau est ${Math.min(...table)}</p>
`);
