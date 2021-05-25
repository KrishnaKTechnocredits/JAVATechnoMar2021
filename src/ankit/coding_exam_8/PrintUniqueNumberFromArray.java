/*
 *Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.
 */


package ankit.coding_exam_8;

public class PrintUniqueNumberFromArray {

	public int[] UniqueFromArray(int[] intArr){
		int[] output = new int[intArr.length]	;
		int j=0;
		for(int index = 0 ; index < intArr.length ; index++) {
			for(j = 0 ; j < index ; j++ ) 
				if(intArr[index] == intArr[j]) 
					break;
			if(index == j) {
				output [index] = intArr[index];
			}
		}	
		return output;	
	}

	void displayUniqueValues(int[] output) {
		for(int index = 0 ; index < output.length ; index++) {
			if(output[index] != 0)
			System.out.print(output[index]+ " ");
		}	
	}

	public static void main(String[] args) {
		int[] inputArr = {10,2,3,10,3,55,61,2};
		PrintUniqueNumberFromArray printUniqueNumberFromArray = new PrintUniqueNumberFromArray();
		int[] output = printUniqueNumberFromArray.UniqueFromArray(inputArr);
		printUniqueNumberFromArray.displayUniqueValues(output);
	}
}
