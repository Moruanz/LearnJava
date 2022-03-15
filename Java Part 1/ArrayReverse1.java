public class ArrayReverse1 {
	//Reverse the array {11,22,33,44,55,66}

	public static void main(String[] args){
		//Define original array 
		int[] arr1 = {11, 22, 33, 44, 55, 66};

		int temp = 0;
		int len = arr1.length;
		for(int i = 0; i < len / 2; i++){
			temp = arr1[len - 1 - i];
			arr1[len - 1 - i] = arr1[i];
			arr1[i] = temp;
		}
		System.out.println("The reversed array is");
		for(int i = 0; i < len; i++){
			System.out.println(arr1[i]);
		}
	}
}
