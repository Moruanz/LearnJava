// Requirement: print nine nine table 
public class nineNineTable {
	//
	public static void main(String[] args){

	int k = 1;
	for (int i = 1; i <= 9; i++) {
		for (int j = 1; j <= i; j++){
			System.out.print( i + " * " + j + " = " + (i*j) + "\t");
		}
		System.out.print("\n");
}
}
}
