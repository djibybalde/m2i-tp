const email = prompt("Entrez votre addresse mail d'inscription: ");
const password = prompt("Entrez votre mot de passe d'inscription: ");

let counter = 1;
while (counter <= 5) {
  logInEmail = prompt("Entrez votre addresse mail: ");
  logInPassword = prompt("Entrez votre mot de passe: ");

  if (logInEmail === email && logInPassword === password) {
    alert("Bienvenu dans votre espace client");
    document.write("Bienvenu dans votre espace client");
    break;
  } else if (counter < 5) {
    alert(
      `Échec tentative ${counter}: Identifiants incorrect. Veuillez réessayer!`
    );
  }
  if (counter === 5) {
    alert(
      `Vous avez effectué ${counter} tentatives. Votre compte est bloqué !`
    );
    document.write(
      `Vous avez effectué ${counter} tentatives. Votre compte est bloqué !`
    );
  }
  counter++;
}
