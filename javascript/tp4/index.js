const email = prompt("Entrez votre addresse mail d'inscription: ");
const password = prompt("Entrez votre mot de passe d'inscription: ");

let logInEmail = prompt("Entrez votre addresse mail: ");
let logInPassword = prompt("Entrez votre mot de passe: ");

if (logInEmail !== email || logInPassword !== password) {
  alert("Identifiants incorrect");
  logInEmail = prompt("Entrez votre addresse mail: ");
  logInPassword = prompt("Entrez votre mot de passe: ");
} else {
  alert("Bienvenu dans votre espace client");
  document.write("Bienvenu dans votre espace client");
}
