const EmptyStudentError = document.querySelector("#err-student");
const studentForm = document.querySelector("#student-form");
const tableBody = document.querySelector("#table-body");

const nomInput = document.querySelector("#nom");
const prenomInput = document.querySelector("#prenom");
const ageInput = document.querySelector("#age");
const genreInputF = document.querySelector("#madame");
const genreInputM = document.querySelector("#monsieur");
const paysInput = document.querySelector("#pays");
const optionInput = document.querySelector("#option");

const coursForm = document.querySelector("#cours-form");
const coursInput = document.querySelector("#cours-input");
const coursList = document.querySelector("#cours-list");
const coursError = document.querySelector("#err-cours");

const querySelector = [
  nomInput,
  prenomInput,
  ageInput,
  genreInputF,
  paysInput,
  optionInput,
];

const studentDatabase = [];
function Student(fName, lName, age, gender, country, option, coursList) {
  this.fName = fName;
  this.lName = lName;
  this.age = age;
  this.gender = gender;
  this.country = country;
  this.option = option;
  this.coursList = coursList;
}

const coursData = [];
const coursDatabase = [];
function Cours(title) {
  this.title = title;
}

studentForm.addEventListener("submit", function (event) {
  event.preventDefault();

  const tr = document.createElement("tr");
  tableBody.append(tr);

  const isInputEmpty =
    !nomInput.value ||
    !prenomInput.value ||
    !ageInput.value ||
    !paysInput.value ||
    !optionInput.value;

  if (isInputEmpty) {
    EmptyStudentError.innerText = "Veuillez remplir tous les champs";
    EmptyStudentError.classList.add("text-red");
  } else {
    const nomError = document.querySelector(".nom");
    const prenomError = document.querySelector(".prenom");
    const ageError = document.querySelector(".age");
    const genderError = document.querySelector(".gender");
    const countryError = document.querySelector(".pays");
    const optionError = document.querySelector(".option");

    const coursDataError = document.querySelector("#cours-list");
    const liElements = document.querySelectorAll("li");

    if (nomInput.value.length < 5) {
      nomError.innerText = "Ce champ doit contenir au mois 5 caractères";
      nomError.classList.add("text-red");
    } else if (typeof nomInput.value === "number") {
      nomError.innerText = "Ce champ ne doit pas contenir de chiffres";
      nomError.classList.add("text-red");
    } else if (prenomInput.value.length < 5) {
      prenomError.innerText = "Ce champ doit contenir au mois 5 caractères";
      prenomError.classList.add("text-red");
    } else if (typeof prenomInput.value === "number") {
      prenomError.innerText = "Ce champ ne doit pas contenir de chiffres";
      prenomError.classList.add("text-red");
    } else if (
      isNaN(parseInt(ageInput.value)) ||
      isNaN(Number(ageInput.value))
    ) {
      ageError.innerText = "Ce champ doit contenir un nombre";
      ageError.classList.add("text-red");
    } else if (!paysInput.value) {
      countryError.innerText = "Ce champ est requis";
      countryError.classList.add("text-red");
    } else if (!optionInput.value) {
      optionError.innerText = "Ce champ est requis";
      optionError.classList.add("text-red");
    } else if (!genreInputF.checked && !genreInputM.checked) {
      genderError.innerText = "Vous devez cocher au moins Madame ou Monsieur";
      genderError.classList.add("text-red");
    } else if (liElements.length === 0) {
      coursDataError.innerText =
        "Vous devez ajouter au moins un cours dans la liste des cours";
      coursDataError.classList.add("text-red");
    } else {
      EmptyStudentError.innerText = "";
      EmptyStudentError.classList.remove("text-red");
      nomError.innerText = "";
      nomError.classList.remove("text-red");
      prenomError.innerText = "";
      prenomError.classList.remove("text-red");
      ageError.innerText = "";
      ageError.classList.remove("text-red");
      countryError.innerText = "";
      countryError.classList.remove("text-red");
      optionError.innerText = "";
      optionError.classList.remove("text-red");
      genderError.innerText = "";
      genderError.classList.remove("text-red");
      coursDataError.innerText = "";
      coursDataError.classList.remove("text-red");
      coursError.innerText = "";
      coursError.classList.remove("text-red");

      // Ajout de l'event de suppression sur le bouton
      const deleteStudentButton = document.createElement("button");
      deleteStudentButton.innerText = "X";
      deleteStudentButton.addEventListener("click", function () {
        deleteStudentButton.parentElement.parentElement.removeChild(
          deleteStudentButton.parentElement
        );
      });
      const nom = document.createElement("td");
      nom.innerText = nomInput.value;

      const prenom = document.createElement("td");
      prenom.innerText = prenomInput.value;

      const age = document.createElement("td");
      age.innerText = ageInput.value;

      const genre = document.createElement("td");
      genre.innerText = genreInputF.checked ? "f" : "m";

      const pays = document.createElement("td");
      pays.innerText = paysInput.value;

      const option = document.createElement("td");
      option.innerText = optionInput.value;

      for (let i = 0; i < liElements.length; i++) {
        coursData.push(...liElements[i].innerText.split("\t"));
      }
      const cours = document.createElement("td");
      cours.innerText = coursData;

      tr.append(
        nom,
        prenom,
        age,
        genre,
        pays,
        option,
        cours,
        deleteStudentButton
      );

      const newStudent = new Student(
        nom.innerText,
        prenom.innerText,
        age.innerText,
        genre.innerText,
        pays.innerText,
        option.innerText,
        cours.innerText
      );
      studentDatabase.push(newStudent);

      for (queryElement of querySelector) {
        queryElement.value = "";
      }
    }
  }
});

console.table(studentDatabase);
coursForm.addEventListener("submit", function (event) {
  event.preventDefault();
  if (coursInput.value.length < 2) {
    coursError.innerText = "Ce champs doit avoir au moin 2 caractères";
    coursError.classList.add("text-red");
  } else {
    const cours = document.createElement("li");
    const deleteTodoButton = document.createElement("button");
    deleteTodoButton.innerText = "X";

    // Ajout de l'event de suppression sur le bouton
    deleteTodoButton.addEventListener("click", function () {
      deleteTodoButton.parentElement.parentElement.removeChild(
        deleteTodoButton.parentElement
      );
    });
    cours.innerText = coursInput.value;
    cours.appendChild(deleteTodoButton);
    coursList.appendChild(cours);

    const newCours = new Cours(coursInput.value);
    coursDatabase.push(newCours);

    coursInput.value = "";
    coursError.innerText = "";
    coursError.classList.remove("text-red");
  }
});

// studentForm.addEventListener("submit", function (event) {
//   event.preventDefault();
//   const tr = document.createElement("tr");
//   tableBody.append(tr);
//   for (queryElement of querySelector) {
//     const td = document.createElement("td");
//     td.innerText = queryElement.value;
//     tr.append(td);
//     queryElement.value = "";
//   }
// });

// 25
// const tbodyData = new Array();
// const trElements = document.querySelectorAll("tr");
// for (let i = 1; i < trElements.length; i++) {
//   tbodyData.push(trElements[i].innerText.split("\t"));
// }

//document.querySelectorAll("tr")[1].innerText

/*
const todoForm = document.querySelector("#todo-form");
const todoInput = document.querySelector("#todo-input");
const todoList = document.querySelector("#todo-list");
const todoError = document.querySelector("#err-todo");
const todoDatabase = [];

function Todo(name) {
  this.name = name;
}

todoForm.addEventListener("submit", function (event) {
  event.preventDefault();
  if (todoInput.value.length === 0) {
    todoError.innerText = "Ce champs doit avoir au moins 2 caractères";
    todoError.classList.add("text-red");
  } else {
    const todo = document.createElement("li");
    const deleteTodoButton = document.createElement("button");
    deleteTodoButton.innerText = "Supprimer";

    // Ajout de l'event de suppression sur le bouton
    deleteTodoButton.addEventListener("click", function () {
      const liParent = deleteTodoButton.parentElement;
      liParent.parentElement.removeChild(liParent);
    });

    todo.innerText = todoInput.value;
    todo.appendChild(deleteTodoButton);

    const newTodo = new Todo(todoInput.value);
    todoDatabase.push(newTodo);
    console.log(todoDatabase);

    todoList.appendChild(todo);
    todoInput.value = "";
    todoError.innerText = "";
    todoError.classList.remove("text-red");
  }
});

/**
 * 
  <ul>
   <li>A <button>x</button></li>
   <li>B <button>x</button></li>
  </ul>

 */

//deleteButton : <button>Supprimer</button>
//deleteButton.parentElement : <li>A <button>x</button></li>
//deleteButton.parentElement.parentElement : <ol>...</ol>
