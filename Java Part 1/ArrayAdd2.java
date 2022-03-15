import java.util.Scanner;

public class ArrayAdd2 {
	//Ways to add elements into an array 
	//The user is able to terminate the process by inputting y/n

	public static void main(String[] args){

		Scanner myScanner = new Scanner(System.in);

		int[] arr1 = {1,2,3};
		do{
			int[] arrNew = new int[arr1.length + 1];//create a new array
			for(int i = 0; i < arr1.length; i++){//copy the original array 
				arrNew[i] = arr1[i];
			}
			System.out.println("Please enter the new element");
			int addNum = myScanner.nextInt();
			arrNew[arrNew.length - 1] = addNum;//add the value to the array, as last element
			arr1 = arrNew; //let the original array become void

			System.out.println("The new array is");
			for (int i = 0; i < arr1.length; i++){
				System.out.println(arr1[i]);  
			}
			//Ask the user if continue to add 
			System.out.println("Continue to add? Y/N");
			char key = myScanner.next().charAt(0);
			if ( key == 'n'){
				break;//if the user choose to exit, use break
			}
		}while(true);
			System.out.println("Exit program");
		}
}
