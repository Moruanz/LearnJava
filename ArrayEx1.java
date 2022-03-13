public class ArrayEx1 {
	//Create an array containing A to Z 
	//Use for-loop to search all elements and print

	public static void main(String[] args){
		char[] chars = new char[26];
		//Since 'A' + 1 = 'B', can use for-loop to assign values
		for (int i = 0; i < chars.length; i++){
			chars[i] = (char)('A' + i);
		}

		System.out.println("Output Array: ");
		for (int i = 0; i < chars.length; i++){
			System.out.println(chars[i]);
		}
	}
}
