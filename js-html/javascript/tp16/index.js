const matrix = new Array();

const len = parseInt(
  prompt(
    "Bonjour! \nDans ce programme, vous allez remplir une matrice carrée. Entrez la taille de la matrice:"
  )
);

let sumDiagonal = 0;
document.write(`
  <p>Matrice carrée de taille ${len}</p>
  <div>
`);
for (let i = 0; i < len; i++) {
  let row = [];
  document.write(`<span class="matrix">`);
  for (let j = 0; j < len; j++) {
    let ij = parseInt(
      prompt(`Entrez l'élément ${j + 1} de la ligne ${i + 1}: `)
    );
    row.push(ij);
    if (i === j) {
      sumDiagonal += ij;
    }
    document.write(`<span class="x">${ij}</span>`);
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
  <p>Somme des éléments de la diagonale donne <strong>${sumDiagonal}</strong></p>
`);
console.log(matrix);
console.log(sumDiagonal);
