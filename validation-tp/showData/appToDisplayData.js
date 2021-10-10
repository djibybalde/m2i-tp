const storedData = JSON.parse(localStorage.getItem("internKey"));
const tableBody = document.querySelector("#table-body");

for (let i = 0; i < storedData.length; i++) {
  const tr = document.createElement("tr");

  const lastName = document.createElement("td");
  lastName.innerText = storedData[i].lName;

  const firstName = document.createElement("td");
  firstName.innerText = storedData[i].fName;

  const emailAddress = document.createElement("td");
  emailAddress.innerText = storedData[i].email;

  const tdAction = document.createElement("td");
  tdAction.classList.add("text-center");

  const deleteButton = document.createElement("button");
  deleteButton.innerHTML = `<i class="fa fa-trash"></i>`;
  deleteButton.classList.add(...["btn", "btn-outline-danger", "btn-sm", "m-1"]);

  const showButton = document.createElement("button");
  showButton.innerHTML = `<i class="fa fa-eye"></i>`;
  showButton.classList.add(...["btn", "btn-outline-success", "btn-sm", "m-1"]);

  deleteButton.addEventListener("click", function () {
    // Methode 1: getIndex ==> delete the index row ==> refresh the data ==> refresh the page
    const index = storedData.findIndex(function (intern) {
      return intern.id === storedData[i].id;
    });
    storedData.splice(index, 1);
    localStorage.setItem("internKey", JSON.stringify(storedData));
    window.location = "/showData/blockToDisplayData.html";
    // // Methode 2: button ==> td ==> tr ==> tbody and delete child
    // deleteButton.parentElement.parentElement.parentElement.removeChild(
    //   deleteButton.parentElement.parentElement
    // );
  });

  showButton.addEventListener("click", function () {
    const index = storedData.findIndex(function (intern) {
      return intern.id === storedData[i].id;
    });
    if (
      document.querySelector(".show-details") &&
      document.querySelector("p").innerText === storedData[index].id
    ) {
      showDetails.classList.remove("show-details");
      showDetails.remove();
      window.location = "/showData/blockToDisplayData.html";
    } else {
      if (document.querySelector("p").innerText !== storedData[index].id) {
        showButton.innerHTML = `<i class="fa fa-eye"></i>`;
      } else {
        showButton.innerHTML = `<i class="fa fa-eye-slash"></i>`;
      }
      showDetails.classList.add(...["container-child", "show-details"]);

      pId.innerHTML = `<span class="hidden-id">${storedData[index].id}</span>`;
      pName.innerText = `${storedData[index].lName}, ${storedData[index].fName}`;
      pEmail.innerHTML = `<span class="bold">Email :</span> <span>${storedData[index].email}</span>`;
      pStudie.innerHTML = `<span class="bold">Etudes faites :</span> <span>${storedData[index].studie}</span>`;
      pBio.innerHTML = `<span class="bold">Bio :</span> <span>${storedData[index].bio}</span>`;
    }
  });

  tdAction.append(deleteButton, showButton);
  tr.append(lastName, firstName, emailAddress, tdAction);
  tableBody.append(tr);
}

const showDetails = document.querySelector("#show-details");
const pId = document.createElement("p");
const pName = document.createElement("p");
const pEmail = document.createElement("p");
const pStudie = document.createElement("p");
const pBio = document.createElement("p");

pName.classList.add("bold");
showDetails.append(pId, pName, pEmail, pStudie, pBio);
