const matrix = new Array();

const len = parseInt(
  prompt(
    "Bonjour! \nDans ce programme, vous allez remplir une matrice carrée. Entrez la taille de la matrice:"
  )
);

let sum = 0;
document.write(`
  <p>Matrice carrée de taille ${len}</p>
  <div>
`);
for (let j = 0; j < len; j++) {
  let row = [];
  document.write(`<span class="matrix">`);
  for (let i = 0; i < len; i++) {
    let x = parseInt(
      prompt(`Entrez l'élément ${i + 1} de la ligne ${j + 1}: `)
    );
    row.push(x);
    if (i === j) {
      sum += x;
    }
    document.write(`<span class="x">${x}</span>`);
  }
  matrix.push(row);
  document.write("</span><br />");
}
// let sumDiagonal = 0;
// for (let j = 0; j < len; j++) {
//   for (let i = 0; i < len; i++) {
//     if (i === j) {
//       sumDiagonal += matrix[i][j];
//     }
//   }
// }
document.write(`
  </div>
  <p>Somme des éléments de la diagonale donne <strong>${sum}</strong></p>
`);
console.log(matrix);
console.log(sum);
