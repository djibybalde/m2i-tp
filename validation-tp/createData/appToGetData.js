const internForm = document.querySelector("#intern-form");
const formError = document.querySelector(".error-form");

const tableBody = document.querySelector("#table-body");

const firstNameInput = document.querySelector("#fname");
const lastNameInput = document.querySelector("#lname");
const emailInput = document.querySelector("#email");
const studieInput = document.querySelector("#studie");
const bioInput = document.querySelector("#bio");

const querySelectorElements = [
  firstNameInput,
  lastNameInput,
  emailInput,
  studieInput,
  bioInput,
];

const internDatabase = [];
function Intern(id, fName, lName, email, studie, bio) {
  this.id = id;
  this.fName = fName;
  this.lName = lName;
  this.email = email;
  this.studie = studie;
  this.bio = bio;
}

internForm.addEventListener("submit", function (event) {
  event.preventDefault();

  const isInputEmpty =
    !firstNameInput.value ||
    !lastNameInput.value ||
    !emailInput.value ||
    !emailInput.value ||
    !studieInput.value;

  if (isInputEmpty) {
    formError.innerHTML =
      "<span> Tous les champs suivis par &#9733; sont requis<span>";
    formError.classList.add("text-red");
  } else {
    const firstNameError = document.querySelector(".fname");
    const lastNameError = document.querySelector(".lname");
    const emailError = document.querySelector(".email");
    const studieError = document.querySelector(".studie");

    if (lastNameInput.value.length < 3) {
      lastNameError.innerText = "Ce champ doit contenir au mois 3 caractères";
      lastNameError.classList.add("text-red");
    } else if (firstNameInput.value.length < 3) {
      firstNameError.innerText = "Ce champ doit contenir au mois 3 caractères";
      firstNameError.classList.add("text-red");
    } else if (
      !emailInput.value.includes("@") ||
      !emailInput.value.includes(".")
    ) {
      emailError.innerText = "Ce-ci n'est pas une addresse email";
      emailError.classList.add("text-red");
    } else if (!studieInput.value) {
      studieError.innerText = "Ce champ doit être selectionné";
      studieError.classList.add("text-red");
    } else {
      lastNameError.innerText = "";
      lastNameError.classList.remove("text-red");
      firstNameError.innerText = "";
      firstNameError.classList.remove("text-red");
      emailError.innerText = "";
      emailError.classList.remove("text-red");
      studieError.innerText = "";
      studieError.classList.remove("text-red");

      const id = uuid.v4();
      const newIntern = new Intern(
        id,
        firstNameInput.value,
        lastNameInput.value,
        emailInput.value,
        studieInput.innerText.split("\n")[studieInput.selectedIndex],
        // studieInput.value,
        bioInput.value
      );
      internDatabase.push(newIntern);

      let storedData = localStorage.getItem("internKey");
      if (!storedData) {
        const internList = [];
        internList.push(newIntern);
        localStorage.setItem("internKey", JSON.stringify(internList));
      } else {
        storedData = JSON.parse(storedData);
        storedData.push(newIntern);
        localStorage.setItem("internKey", JSON.stringify(storedData));
      }

      for (queryElement of querySelectorElements) {
        queryElement.value = "";
      }
      window.location = "/showData/blockToDisplayData.html";
    }
  }
});
