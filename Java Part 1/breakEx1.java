// Practise questions using break

/*
	Qn1. sum of 1-100, find the number which makes the sum > 20
	Qn2. Log in verification, there will be 3 chances, if user name is "Alex"
	and password is 888, log in successful, otherwise, show number of attempts left
*/

import java.util.Scanner;

public class BreakEx1 {
	
	public static void main(String[] args){

	Scanner myScanner = new Scanner(System.in);//use scanner to receive input

	// int sum = 0;
	// int target = 20;
	// for (int i = 1; i <= 100; i++){
	// 	sum += i;
	// 	if (sum >= target){
	//		System.out.println("The number we found is " + i);
	// 		break;
	// 	}
	// 	
	// }

	for (int i = 1; i <= 3; i++){
		System.out.println("Please enter user name");
		String userName = myScanner.next();
		System.out.println("Please enter password");
		String password = myScanner.next();
		if ("Alex".equals(userName) && "888".equals(password)){
			System.out.println("Log in successful");
			break;
		} else {
			System.out.println("Log in unsuccessful!" + (3 - i) + " Attempts remaining");
		}
	}
}
}
