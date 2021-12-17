// Post incrémentation: a = b et b+=1 (b++)
var a = 1;
var b = 1;
a = b++; // la valeur b s'est incrémenté et la valeur reste 1
console.log(`a: ${a}; b: ${b}`);

//Pre-incrémentation: b+=1 et a=b
var a = 1;
var b = 1;
a = ++b; // la valeur a s'incrémenté de 1
console.log(`a: ${a}; b: ${b}`);
