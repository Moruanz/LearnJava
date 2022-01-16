class fizzBuzz {

  // start with main
  public static void main(String[] args) {
  
  // start the for loop with initial value of i = 0
  for (int i = 0; i < 101; i++){

    //check divisible by 3 but not divisible by 5
    if (i % 3 == 0 && i % 5 != 0){
      System.out.println("Fizz");

    //check divisible by 5 but not divisible by 3
    } else if (i % 3 != 0 && i % 5 == 0){
    System.out.println("Buzz");

    //check divisible by both 5 and 3 
  } else if (i % 3 != 0 && i % 5 == 0){
    System.out.println("FizzBuzz");
  } else {
    //print the rest
    System.out.println(i);
  }
  }
}
}
