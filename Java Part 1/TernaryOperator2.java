// Demostrates the usage of ternary operator


public class TernaryOperator2 {
	//insert main
	public static void main(String[] args){

		int a = 10;
		int b = 99;

		//Ternary Operator
		int result = a > b ? a++ : b--; //if the comparation is true, return 1st statement, otherwise return 2nd

		System.out.println("The result is " + result); //will return the value of b 1st, then -1 from b, result is 99
		System.out.println("The value of b is " + b); // b is now 98, because b-- is executed.  

	}
}
