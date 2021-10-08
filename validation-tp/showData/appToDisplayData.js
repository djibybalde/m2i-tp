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
    //Methode 1: getIndex ==> delete the index row ==> refresh the data ==> refresh the page
    const index = storedData.findIndex(function (intern) {
      return (intern.id = storedData[i].id);
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
    const showDetails = document.querySelector("#show-details");
    if (!document.querySelector(".show-details")) {
      showDetails.classList.add(...["container-child", "show-details", "m-3"]);

      const index = storedData.findIndex(function (intern) {
        return (intern.id = storedData[i].id);
      });

      const pName = document.createElement("p");
      pName.innerText = `${storedData[index].lName} ${storedData[index].fName}`;

      const pEmail = document.createElement("p");
      pEmail.innerHTML = `<span>Email :</span> <span>${storedData[index].email}</span>`;

      const pStudie = document.createElement("p");
      pStudie.innerHTML = `<span>Etudes faites :</span> <span>${storedData[index].studie}</span>`;

      const pBio = document.createElement("p");
      pBio.innerHTML = `<span>Bio :</span> <span>${storedData[index].bio}</span>`;

      showDetails.append(pName, pEmail, pStudie, pBio);
    } else {
      showDetails.classList.remove("show-details");
      showDetails.remove();
      showButton.innerHTML = "";
      showButton.innerHTML = `<i class="fa fa-eye-slash"></i>`;
      window.location = "/showData/blockToDisplayData.html";
    }
  });

  tdAction.append(deleteButton, showButton);
  tr.append(lastName, firstName, emailAddress, tdAction);
  tableBody.append(tr);
}
