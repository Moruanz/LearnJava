//If-else if-else controlled flow exercise 4

	/*  
	Requirement: to enter the finals of a tournament based on 1st round results
	Also need to identify the gender group of participants.
	If the 1st round score > 8.0, then can enter the finals, otherwise eliminated.
	*/


import java.util.Scanner;//import Scanner

public class IfExercise4 {
	//insert main
	public static void main(String[] args){

	Scanner myScanner = new Scanner(System.in);
	System.out.println("Please enter your 1st round score");
	double score = myScanner.nextDouble();

	if(score > 8.0) {
		System.out.println("Please enter your gender");
		char gender = myScanner.next().charAt(0);
		if (gender == 'M'){
			System.out.println("Congrats! You are in male finals");
		} else if (gender == 'F'){
			System.out.println("Congrats! You are in female finals");
		} else {
			System.out.println("Wrong input");
		}
	} else {
		System.out.println("Sorry, you have been eliminated");
	}
  }
}





