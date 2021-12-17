//
function createListTag(tagName, content) {
  const li = document.createElement(tagName);
  li.innertext = content;
  return li;
}

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
