// FUNCTIONS

// TP 19 : O(n)
function calculateSumDiagonal(matrix) {
  let sumDiagonal1 = 0;
  let sumDiagonal2 = 0;
  for (let i = 0; i < matrix.length; i++) {
    sumDiagonal1 += matrix[i][i]; // if (i === j)
    sumDiagonal2 += matrix[i][matrix.length - i - 1]; // if (i + j === len - 1 )
  }
  return sumDiagonal1 + sumDiagonal2;
}

// TP 20 : O(n)
function rotateArray(arr, numberOfRotations, direction) {
  const arrayToRotate = [...arr];
  for (let i = 1; i <= numberOfRotations; i++) {
    if (direction === "right") {
      // RIGHT: Get the last element and put it to the beginning of the table
      const popedValue = arrayToRotate.pop();
      arrayToRotate.unshift(popedValue);
    } else {
      // LEFT: Get the 1st element and put it at the end of the table
      const popedValue = arrayToRotate.shift();
      arrayToRotate.push(popedValue);
    }
  }
  return arrayToRotate;
}

// OBJECTS

const article = {
  designation: "T-shirt", // atributes
  reference: "e584nb64p", // atributes
  pritHT: 15, // atributes
  calculPrixTTC() {
    // Methods
    return 1.2 * this.pritHT; // this fait référence à l'obj lui même
  },
};
//console.log(article.calculPrixTTC());

// EXO
const mobile = {
  distance: parseInt(prompt("Entrez la distance:")),
  temps: parseInt(prompt("Entrez le temps:")),
  vitesse: 0,
  calculerVitesse() {
    return (this.vitesse = this.distance / this.temps);
  },
};

console.log(mobile.calculerVitesse());

function Article(designation, reference, pritHT) {
  this.designation = designation;
  this.reference = reference;
  this.pritHT = pritHT;
}

// Sans le mot clef new, la function est considérer comme une function ordinaire donc sans le return, elle est undefined
// Avec new sachant que on a les attributes avec this, on n'a pas besoin de return pour recuper les proprietes de la fonction
const tshirt = new Article(arguments);

//////////////////////////////////////////////////
function Article(designation, reference, prixHT, qteStock) {
  this.designation = designation;
  this.reference = reference;
  this.prixHT = prixHT;
  this.qteStock = qteStock;
}

//1 - Avant arrivage
const articles = [];
//2 - Arrivage des articles

const qteArticle = parseInt(prompt("Combien d'articles sont arrivés : "));
for (let i = 1; i <= qteArticle; i++) {
  const designation = prompt("Designation : ");
  const reference = prompt("Ref : ");
  const prixHT = parseFloat(prompt("PrixHT : "));
  const qteStock = parseInt(prompt("Quantite : "));
  const article = new Article(designation, reference, prixHT, qteStock);
  articles.push(article);
}

// 3 - Affichage dans le site internet : simple
for (let i = 0; i < articles.length; i++) {
  console.log(articles[i]);
}
// Afffichage détaillé
document.write("<h1>Articles</h1>");
document.write(
  '<table border="1"><thead><tr><th>Reference</th><th>Désignation</th><th>PrixHT</th><th>Quantité en stock</th></tr></thead><tbody>'
);
for (let i = 0; i < articles.length; i++) {
  document.write(
    `<tr><td>${articles[i].reference}</td><td>${articles[i].designation}</td><td>${articles[i].prixHT}</td><td>${articles[i].qteStock}</td></tr>`
  );
}
document("</tbody></table>");
