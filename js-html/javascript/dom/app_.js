//Accéder à une collection
const para = document.querySelectorAll("p");

console.log(para[0]);

para[0].innerText = "Raphael Henon est un dev";

const liste = document.querySelectorAll("li");
liste[3].innerText = "Java";

para[2].innerText = "NOUBISSI";

for (let i = 0; i < para.length; i++) {
  para[i].innerText = "Ce qu'on veut écrire";
  para[i].style.color = "red";
  para[i].style.fontWeight = "bold";
  para[i].style.fontStyle = "italic";
  para[i].style.border = "solid black 2px";
}

//Mettre en rouge tous les élements impairs de la liste des technos

for (let i = 0; i < liste.length; i = i + 2) {
  liste[i].style.color = "red";
  // liste[i].style.
}

//Accéder à une occurence

const p = document.querySelector("p");
p.innerText = "Je suis dans une joie immence";

// Ajouter des elements
const technos = document.querySelector("#technos");

technos.innerHTML += "<li>Papapapa</li>";
// console.log(technos.innerHTML);

// Ajouter Kubernetes avant les autres éléments
const devops = document.querySelector("#devops");
devops.innerHTML = "<li>Kubernetes</li>" + devops.innerHTML;

/////////////////////////////////////////////////////
function createListTag(tagName, content) {
  const li = document.createElement(tagName);
  li.innertext = content;
  return li;
}
// Version Jihane
const langages = document.querySelector("#langages");
const listLang = document.createElement("h3");
listLang.innerText = "Listes des Langages ";

const listeDesLangages = ["C", "C++", "Go"];
const listOrdonnee = document.createElement("ol");

for (let i = 0; i < listeDesLangages.length; i++) {
  const li = createListTag("li", listeDesLangages[i]);
  listOrdonnee.appendChild(li);
}
langages.append(listLang, listOrdonnee);

//////// CSS STYLE //////////
const btnApplyCSS = document.querySelector("#apply-css");
const btnRemoveCSS = document.querySelector("#remove-css");
const html = document.querySelector("#html");
const technos = document.querySelector("#technos");

// Add/Remove
let clicsForAdding = 0;
let clicsForRemoving = 0;

const add = document.querySelector("#add");
const remove = document.querySelector("#remove");

add.innerText = clicsForAdding;
remove.innerText = clicsForRemoving;
//==============================================

html.addEventListener("mouseover", function (event) {
  console.log("event.target", event.target);
  console.log("HTML : ", this);
  this.style.color = "red";
});

btnApplyCSS.addEventListener("click", function () {
  console.log("Avant classes : ", this);
  technos.classList.add("text-red", "text-italic");
  console.log("Après classes : ", this);
  clicsForAdding = clicsForAdding + 1;
  add.innerText = clicsForAdding;
});

btnRemoveCSS.addEventListener("click", removeCSS);

function removeCSS() {
  technos.classList.remove("text-red", "text-italic");
  clicsForRemoving = clicsForRemoving + 1;
  remove.innerText = clicsForRemoving;
}
