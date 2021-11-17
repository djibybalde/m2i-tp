const list1 = new Array();
const list2 = new Array();

const len = parseInt(
  prompt(
    `Bonjour! \nDans ce programme, vous allez créer deux listes de nombre qui doivent avoir la même taille. Entrez la taille des deux listes:`
  )
);
for (let i = 0; i < len; i++) {
  list1.push(parseInt(prompt(`Entrez l'élément ${i + 1} de la liste 1: `)));
}
for (let i = 0; i < len; i++) {
  list2.push(parseInt(prompt(`Entrez l'élément ${i + 1} de la liste 2: `)));
}

document.write(`
  <p>Liste 1: <span class="l1">[${list1}]</span></p>
  <p>Liste 2: <span class="l2">[${list2}]</span></p> 
`);

let sumList = [];
document.write("<p>Liste 3: [");
for (let i = 0; i < len; i++) {
  sumList.push(list1[i] + list2[i]);
  document.write(
    `${sumList[i]}(<span class="l1">${list1[i]}</span>+<span class="l2">${list2[i]}</span>), `
  );
}
document.write("]</p>");
