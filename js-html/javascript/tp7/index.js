let number = parseInt(prompt("Entrez un nombre compris entre 10 et 20: "));

while (!(number >= 10 && number <= 20)) {
  if (number > 20) {
    number = parseInt(prompt("Plus petit encore !"));
  }
  if (number < 10) {
    number = parseInt(prompt("Plus grand encore !"));
  }
}
if (number >= 10 && number <= 20) {
  alert(`Très bien ! ${number} est bien compris entre 10 et 20.`);
  document.write(`Très bien ! ${number} est bien compris entre 10 et 20.`);
}
