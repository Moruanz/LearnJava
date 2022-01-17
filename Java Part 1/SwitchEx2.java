// Demonstrate the usage of switch fall through case
// need to import java.util to use scanner

import java.util.Scanner;


public class SwitchEx2 {
	//insert main
	public static void main(String[] args){

	Scanner myScanner = new Scanner(System.in);
	System.out.println("Please enter the month, from 1 to 12");
	int month = myScanner.nextInt();
	switch (month) {
	    case 3:
        case 4:
        case 5:
        	System.out.println("Spring season");
        	break;
        case 6:
        case 7:
        case 8:
        	System.out.println("Summer season");
        	break;
        case 9:
        case 10:
        case 11:
        	System.out.println("Autumn season");
        	break;
        case 12:
        case 1:
        case 2:
        	System.out.println("Winter season");
        	break;
	}
}

