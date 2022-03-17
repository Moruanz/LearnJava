//Use Bubble sorting, for these numbers 24,69,80,57,13
//From smallest to biggest

public class BubbleSort {
	public static void main(String[] args){
		int[] arr1 = {24, 69, 80, 57, 13};
		int temp = 0; //temporary variable to help swap place

		for (int i = 0; i < arr1.length - 1; i++){
			for (int j = 0; j < arr1.length - 1 - i; j++){//Compare 4 times, then 3, 2, 1
				if(arr1[j] > arr1[j + 1]){
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
		}
		System.out.println("The sorted array is ");
		for (int k = 0; k < arr1.length; k++){
			System.out.println(arr1[k]);
		}
	}
}
