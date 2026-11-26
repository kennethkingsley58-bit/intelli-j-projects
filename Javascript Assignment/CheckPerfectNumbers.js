function checkPerfectNumber(number){

let sum = 0;
for(let count = 0; count < number; count++){
if(number % count ==  0 ){
sum = sum + count;

}
 if( number == sum){
 return true
 
 
 }
 else{
 
 return false
 }

}

}
console.log(checkPerfectNumber(5));
