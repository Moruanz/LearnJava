public class ArrayEx2 {
	//Find out the max value of an array, show its index

	public static void main(String[] args){
		int[] arr1 = {4, -1, 9, 10, 23};
		int max = arr1[0];//assume the 1st one is max
		int maxIndex = 0;

		for (int i = 1; i < arr1.length; i++){
			if (max < arr1[i]){
				max = arr1[i];
				//if max changes, assign new value to max
				maxIndex = i;//also update index
			}
		}
		System.out.println("max is " + max +" Index is " + maxIndex);
	}
}
