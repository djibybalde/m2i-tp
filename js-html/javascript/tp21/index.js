function Etudiant(nom, prenom, age, genre, pays, option, listeCours) {
  this.nom = nom;
  this.prenom = prenom;
  this.age = age;
  this.genre = genre;
  this.pays = pays;
  this.option = option;
  this.listeCours = listeCours;
}

Etudiant.prototype.setNom = function (valeur) {
  return (this.nom = valeur);
};
Etudiant.prototype.setPrenom = function (valeur) {
  return (this.prenom = valeur);
};
Etudiant.prototype.setOption = function (valeur) {
  return (this.prenom = valeur);
};

const etudiants = [];

const qteEtudiant = parseInt(prompt("Combien d'étudiants dans la liste :"));
const nbCours = parseInt(prompt("Nombre de cours:"));

for (let i = 1; i <= qteEtudiant; i++) {
  const nom = prompt("Nom :");
  const prenom = prompt("Prénom :");
  const age = parseInt(prompt("Age : "));
  const genre = prompt("Genre : ");
  const pays = prompt("Pays : ");
  const option = prompt("Option : ");
  const listeCours = [];
  for (let j = 0; j < nbCours; j++) {
    listeCours.push(prompt(`Cours ${j + 1}: `));
  }
  const etudiant = new Etudiant(
    nom,
    prenom,
    age,
    genre,
    pays,
    option,
    listeCours
  );
  etudiants.push(etudiant);
}

for (let i = 0; i < etudiants.length; i++) {
  console.log(etudiants[i]);
}

// const etudiants = [
//   {
//     id: 1,
//     nom: "Lisangola",
//     prenom: "Christian",
//     pays: "Russie",
//     genre: "M",
//   },
//   { id: 2, nom: "Histane", prenom: "Salma", pays: "Russie", genre: "F" },
//   { id: 2, nom: "Histane", prenom: "Salma", pays: "chine", genre: "F" },
//   { id: 2, nom: "Cnnnn", prenom: "Salma", pays: "chine", genre: "F" },
//   { id: 2, nom: "Histane", prenom: "Salma", pays: "Russie", genre: "F" },
//   { id: 2, nom: "Kmmme", prenom: "Salma", pays: "Russie", genre: "F" },
//   { id: 3, nom: "Bossard", prenom: "Benjamin", pays: "France", genre: "M" },
// ];

let countChinoise = 0; // 1
const PeopleNameEndWithA = []; // 2
const womenChinese = [];
const allNames = []; // 3
const menRussian = []; // 4
const womenStartWithK = [];
const menStartWithK = [];

for (let i = 0; i < etudiants.length; i++) {
  allNames.push(etudiants[i].nom); // 3
  if (
    etudiants[i].pays.toLowerCase() === "chine" &&
    etudiants[i].genre.toLowerCase() === "f"
  ) {
    womenChinese.push(etudiants[i]);
    countChinoise++; // 1
  }
  if (
    etudiants[i].prenom[etudiants[i].prenom.length - 1].toLowerCase() === "a"
  ) {
    PeopleNameEndWithA.push(etudiants[i]); // 2
  }
  if (
    etudiants[i].pays.toLowerCase() === "russie" &&
    etudiants[i].genre.toLowerCase() === "m"
  ) {
    menRussian.push(etudiants[i]); // 4
  }
  if (
    etudiants[i].nom.toLowerCase()[0] === "k" &&
    etudiants[i].genre.toLowerCase() === "f"
  ) {
    womenStartWithK.push(etudiants[i]);
  }
  if (
    etudiants[i].prenom.toLowerCase()[0] === "m" &&
    etudiants[i].genre.toLowerCase() === "m"
  ) {
    menStartWithK.push(etudiants[i]);
  }
}
// console.log(countChinoise);
// console.log(PeopleNameEndWithA);
// console.log(womenChinese);
// console.log(allNames);
// console.log(menRussian);
// console.log(womenStartWithK);
// console.log(menStartWithK);
