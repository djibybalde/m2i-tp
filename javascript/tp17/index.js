const matrix = new Array();

const len = parseInt(
  prompt(
    "Bonjour! \nDans ce programme, vous allez remplir une matrice carrée. Entrez la taille de la matrice:"
  )
);

document.write(`
  <p>Matrice carrée de taille ${len}</p>
  <div>
`);
for (let j = 0; j < len; j++) {
  let row = [];
  document.write(`<span class="matrix">`);
  for (let i = 0; i < len; i++) {
    let ij = parseInt(
      prompt(`Entrez l'élément ${i + 1} de la ligne ${j + 1}: `)
    );
    row.push(ij);
    document.write(`<span class="x">${ij}</span>`);
  }
  matrix.push(row);
  document.write("</span><br />");
}

let diag1 = 0;
let diag2 = 0;
for (let j = 0; j < len; j++) {
  for (let i = 0; i < len; i++) {
    //element from the main diagonal
    if (i === j) {
      diag1 += matrix[i][j];
    }
    // element from the counter diagonal
    if (i + j === len - 1) {
      diag2 += matrix[i][j];
    }
  }
}
document.write(`
  </div>
  <p>Somme des éléments de la 1ère diagonale donne <strong>${diag1}</strong></p>
  <p>Somme des éléments de la 2ème diagonale donne <strong>${diag2}</strong></p>
`);
console.log(matrix);
console.log(diag1);
console.log(diag2);
