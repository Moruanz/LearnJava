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
	int sum = 0; //variable to store the sum
	int start = 1;//separate variable for start number
	int end = 100;//separate variable for end number
	for (int i = start ; i <= end; i++ ) {//first, output number 1-100
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

