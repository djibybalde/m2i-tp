const calculatorForm = document.querySelector("#caculator-form");
const rayon = document.querySelector("#rayon");

calculatorForm.addEventListener("submit", function (event) {
  event.preventDefault();
  document.querySelector("#diametre").value = 2 * rayon.value;
  document.querySelector("#circ").value = 3.14 * 2 * rayon.value;
  document.querySelector("#aire").value = 3.14 * Math.pow(rayon.value, 2);
});
