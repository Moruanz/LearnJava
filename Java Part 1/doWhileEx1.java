//1st Exercise using do...while loop
/*
	Count the number of integers between 1 and 200 that 
	can be fully divisible by 5 but not fully divisible by 3
*/



public class doWhileEx1 {
	//
	public static void main(String[] args){

	int i = 1;//set start range
	int endNum = 200;//set end range
	int count = 0;//count the number of integers 
	do {
		if ( i % 5 == 0 && i % 3 != 0){
			System.out.println("The value of such i is " + i);
			sum++;
		} i++;
	} while (i <= endNum);

	System.out.println("Exit do...while loop");
	System.out.println("i is " + i);
	System.out.println("The count is " + count);

	

    }
}

