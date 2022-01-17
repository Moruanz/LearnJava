//1st Exercise using for loop
/*
	Requirement: print multiples of 9 from 1 to 100
	count the number of such integers 
	calculate the sum
*/



public class ForExercise1 {
	//
	public static void main(String[] args){




  int count = 0; //variable to store the count 
	int sum = 0; 
	for (int i = 1 ; i <= 100; i++ ) {//first, output number 1-100
		if( i % 9 == 0 ){
			count++;
			sum += i;
			System.out.println("i = " + i);
		}
    }
    System.out.println("There are " + count +" such number");
    System.out.println("The sum is " + sum);
	}
}
