// Import statement:
import java.util.ArrayList;

class PrimeDirective {
  
  // Add your methods here:
  // This is isPrime method to sort out prime numbers 
  public boolean isPrime(int number){
    // body of the method:
    // if the number is 2, output the case
    if (number == 2){
      return true;
    // if the number is less than 2, not prime for sure
    } else if (number < 2){
      return false;
    } else {
    // if the number cannot be fully divided by any other numbers greater than 2 
    for (int i = 2; i < number; i++){
      if (number % i == 0){
        return false;
      } else {
        return true;
      }
    }
  }
  return true;
  }
 
 // create an arraylist with integers, method is onlyPrimes
 public ArrayList<Integer> onlyPrimes(int[] numbers){

   //the name of the Arraylist is primes
   ArrayList<Integer> primes = new ArrayList<Integer>();

   for (int number : numbers){
     if (isPrime(number) == true){
       primes.add(number);
     }
   }
   return primes;
 }
  
  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.onlyPrimes(numbers));
      

    
  

  }  

}
