let distance = parseInt(prompt("Entrer la distance parcourue (m): "));
let temps = parseInt(prompt("Entrer le temps effectué (sec): "));
const vitesse = distance / temps;

alert(`La vitesse parcourue est ${vitesse}m/s`);
document.write(`La vitesse parcourue est ${vitesse}m/s`);
