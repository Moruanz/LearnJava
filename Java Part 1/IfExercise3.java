//If-else if-else controlled flow


import java.util.Scanner;//import Scanner

public class IfExercise3 {
	//insert main
	public static void main(String[] args){

	Scanner myScanner = new Scanner(System.in);
	System.out.println("Please enter your credit score");
	int score = myScanner.nextInt();//get the input of credit score

	if (score >= 1 && grade <= 100){//check the value is valid or not 
		if (score == 100){
		System.out.println("Your credit record is excellent!");
	} else if (score > 80 && score <=  99){
		System.out.println("Your credit record is great!");
	} else if (score >= 60 && score <=  80){
		System.out.println("Your credit record is normal!");
	} else {
		System.out.println("Please try to increase your credit score!");
	}
	} else {
		System.out.println("Please enter a value between 0 and 100");
	}
    }
}	
