const tonAge = parseInt(prompt("Entrez votre age: "));

let ageCategorie;
if (tonAge >= 7 && tonAge <= 9) {
  ageCategorie = "Poussin";
} else if (tonAge >= 10 && tonAge <= 11) {
  ageCategorie = "Pupille";
} else if (tonAge >= 12 && tonAge <= 13) {
  ageCategorie = "Benjamin";
} else if (tonAge >= 14 && tonAge <= 15) {
  ageCategorie = "Minime";
} else if (tonAge >= 16 && tonAge <= 17) {
  ageCategorie = "Cadet";
} else {
  ageCategorie = "n'est pas dans la catégorie";
}

document.write(`Vous êtes ${ageCategorie} !`);
alert(ageCategorie);
