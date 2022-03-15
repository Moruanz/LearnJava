public class ArrayAdd1 {
	//Ways to add elements into an array 

	public static void main(String[] args){
		int[] arr1 = {1,2,3};
		int[] arrNew = new int[arr1.length + 1];//create a new array
		for(int i = 0; i < arr1.length; i++){//copy the original array 
			arrNew[i] = arr1[i];
		}
		arrNew[arrNew.length - 1] = 4;//add the value to the array, as last element
		arr1 = arrNew; //let the original array become void 
		
		System.out.println("The new array is");
		for (int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}
}
