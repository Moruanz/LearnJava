//Requirement: to print the hollow pyramid shape using * symbol

public class starPyramid {
	
	public static void main(String[] args){
	// //print out slanted pyramid
	// 	for (int i = 1; i <= 5; i++){ //i is the nth floor
	// 		for (int j = 1; j <= i; j++){
	// 		System.out.print("*");
	// 		}
	// 	System.out.println("\n");
	// 	}


	//print out solid pyramid
	// int numLevel = 5;
	// 	for (int i = 1; i <= numLevel; i++){ //i is the nth floor
	// 		for (int k = 1; k <= (numLevel - i); k++){
	// 			System.out.print(" ");
	// 		}

	// 		for (int j = 1; j <= (2 * i - 1); j++){
	// 			System.out.print("*");
	// 		}
	// 	System.out.print("\n");
	// 	}
	int numLevel = 20;
		for (int i = 1; i <= numLevel; i++){ //i is the nth floor
			for (int k = 1; k <= (numLevel - i); k++){
				System.out.print(" ");
			}

			for (int j = 1; j <= (2 * i - 1); j++){
				if( j == 1 || j == (2 * i - 1) || i == numLevel ){
					System.out.print("*");
				} else { 
					System.out.print(" ");
				}
			}
		System.out.print("\n");
		}
	}
}
