// Demonstrate the usage of scanner in java
// need to import java.util 

import java.util.Scanner;


public class ScannerInput {
	//insert main
	public static void main(String[] args){
	// 1. The scanner has been imported 
	// 2. Create scanner object
 
    Scanner myScanner = new Scanner(System.in);
    // 3. Receive user input 
    System.out.println("Please enter your name");
    // 4. Use method to receive the input 
    String name = myScanner.next(); // Receive the input in string format
    System.out.println("Please enter your age");
    int age = myScanner.nextInt(); // Receive the input in int format
    System.out.println("Please enter your salary");
    double salary = myScanner.nextDouble();//Receive the input in double format
    System.out.println("Your info is: ");
    System.out.println("Name: " + name + " Age: " + age + " Salary: " + salary);
    }
}
