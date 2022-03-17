//Search an array, if the user's input is included in the array
//Show that the input is found

import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args){
		String[] names = {"James", "Kobe", "Anthony", "Carter"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter a name");
		String findName = myScanner.next();

		//Now traversal the array
		//How to know if we have not found an element?
		//use Index 

		int index = -1;
		for (int i = 0; i < names.length; i++){
			if(findName.equals(names[i])){
				System.out.println("Found it!");
				System.out.println("The index is" + i);
				index = i;
				break;//exit the loop
			}
		}

		if (index == -1){//means didnt find a value
			System.out.println("Not found!");
		}
	}
}
