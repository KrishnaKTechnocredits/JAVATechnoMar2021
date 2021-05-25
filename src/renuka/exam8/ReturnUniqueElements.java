package renuka.exam8;

/*Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}*/

public class ReturnUniqueElements {
	
	int[] givenarray(int arr[]) {

		int[] output = new int[arr.length];
		output[0] = arr[0];
		int num = 0;
		
		for (int index = 0; index < arr.length; index++) {
			boolean isNumPresent = false;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex]) {
					isNumPresent = true;
					break;
				}
			}
			if (isNumPresent == false) 
				num = 1;
				output[num] = arr[index];
			    num++;
			
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 2, 3, 10, 3, 55, 61, 2 };
		ReturnUniqueElements returnUniqueElements = new ReturnUniqueElements();

		int[] arrOutput = returnUniqueElements.givenarray(arr);
		for (int index = 0; index < arrOutput.length; index++) {
			if (arrOutput[index] != 0)
				System.out.print(arrOutput[index] +" ");
		}
	}

}
