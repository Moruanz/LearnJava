// 1st Exercise of Ternary Operator 
// To find out the maximum values of 3 numbers 


public class TernaryOperatorEx1 {
	//insert main
	public static void main(String[] args){

		int n1 = 55;
		int n2 = 33;
		int n3 = 123;
	//Thought: 
	//1. to find out the max value btw n1 and n2, save it to max1
	//2. to find out the max value btw max1 and n3, save it to max2

		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;

		System.out.println("The max number is " + max2);



	//If can use 1 line to complete
		int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
	//Not recommended!
		System.out.println("The max number is " + max);

	}
}
