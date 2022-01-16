// The concept of bitwise operation

public class BitwiseOperator {
	//insert main
	public static void main(String[] args){

	System.out.println(2&3);
	// &: AND
	//1. get the sign magnitude of 2: 2 is an int, takes up 4 bytes, each byte is 8bits 
	//00000000 00000000 00000000 00000010
	//2. get the two's complement of 2: positive number two's complement = sign magnitude
	//00000000 00000000 00000000 00000010 same 
	//3. get the sign magnitude of 3:
	// 00000000 00000000 00000000 00000011
	//4. get the two's complement of 3:
	// 00000000 00000000 00000000 00000011
	//5. Calculate AND (&): if all is 1, result is 1, otherwise is 0
	//00000000 00000000 00000000 00000010
	//00000000 00000000 00000000 00000011
	//00000000 00000000 00000000 00000010 --> This is two's complement
	//Convert to sign-magnitude 
	//00000000 00000000 00000000 00000010 --> positive number, sign-magnitude is the same
	//Result is 2

	System.out.println(~-2);
	//~: complement 
	//1. Sign magituide of -2:
	//10000000 00000000 00000000 00000010
	//2. Two's complement of -2:--> Get 1's complement --> +1
	//3. 1's complement of -2:--> sign digit no change, other digits reverse
	//11111111 11111111 11111111 11111101
	//4. plus 1 to 1's complement
	//11111111 11111111 11111111 11111110
	//Rule of ~ : 1 --> 0 , 0 --> 1
	//00000000 00000000 00000000 00000001
	//It is a positive number
	//Sign-magnitude is this value 
	//Result is 1

	System.out.println(~2);
	//Result is -3
    }
}
