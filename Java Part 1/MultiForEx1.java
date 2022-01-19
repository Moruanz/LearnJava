//1st Exercise using multiple for loops 
/*
	Requirement:
	Collect test results from 3 classes, each class has 5 students
	1. Calculate avg score for each class & for all classes
	2. Count the number of student pass for each class
*/



/* 
	Idea illustration
	(1) For 1 class
	1.1 use scanner to receive inputs 
	1.2 use variable sum to store the sum of all scores
	(2) For 3 classes, each class has 5 students
	(3) Count the number of passed student
*/

import java.util.Scanner;

public class MultiForEx1 {
	//
	public static void main(String[] args){
	Scanner myScanner = new Scanner(System.in);
	double allSum = 0;
	int passNum = 0;
	for (int i = 1; i <= 3; i++){
		double sum = 0;
		for (int j = 1; j <= 5; j++) {
			System.out.println("Key in the score for student " + j +" of class " + i);
			double score = myScanner.nextDouble();
			if (score >= 60){
			// >= 60 is pass
				passNum++;
			}
			sum += score; //calculate sum
			System.out.println("This student's score is " + score);
		}
		allSum += sum;
		System.out.println("The average score of class " + i + " is " + (sum/5));
	}
	System.out.println("The average score for all classes is " + (allSum/15));
	System.out.println("There are " + passNum + " students passed");
}
}
