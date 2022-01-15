public class ChangeChar {

	//escape character demostration
	public static void main(String[] args){

//1. \t:
		System.out.println("London\tToronto");

//2. \n: newline 
		System.out.println("London\nToronto\nShanghai");
//3. \\: output "\"
		System.out.println("London\\Toronto");
// output"\\
		System.out.println("London\\\\Toronto");
//4. \'
		System.out.println("London\'Toronto\'");
//5. \r : enter 
		System.out.println("UKLondonbridge\rToronto");
		System.out.println("UKLondonbridge\r\nToronto");



//Exercise
		System.out.println("Name\tAuthor\tPrice\tQuantity\r\nKing\tBob\t120\t10000");
	}

}
