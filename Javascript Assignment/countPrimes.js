function countPrimes(upperLimit){
let count = 0;
for(let number = 1; number  < upperLimit; number++){

let primeNumber= 0;
for(let  count = 1; count < upperLimit; count++){
if(number % count == 0){

primeNumber += 1;

}



}
if(count == 2){
count++



}
}

return count;
}
console.log(countPrimes(10));


