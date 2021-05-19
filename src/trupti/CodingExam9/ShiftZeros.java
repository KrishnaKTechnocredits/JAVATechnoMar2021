package trupti.CodingExam9;
/*Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]*/

public class ShiftZeros {

	int[] shiftZerosToEnd(int [] input) {
		int[] output = new int [input.length]; 
		int temp;
		for(int index = 0; index < input.length; index++) {

			if(input[index] == 0) { 
				int tempIndex = index; 
				for(int innerIndex=tempIndex+1; innerIndex<input.length; innerIndex++ ) {
					temp = input[innerIndex];
					input[innerIndex] = input[tempIndex];
					input[tempIndex++] = temp;
				}
			}

		}
		return input;
	}

	void printArray(int [] arr) {
		for(int index = 0; index < arr.length; index++) {
			if(index == arr.length -1)
				System.out.print(arr[index]);	
			else	
				System.out.print(arr[index]+" , ");	
		}
	}
	
	
	public static void main(String[] args) {
		int [] input = {1,3,0,3,6,0,9,23,45};
		ShiftZeros shiftZeros = new ShiftZeros();
		int [] output = shiftZeros.shiftZerosToEnd(input);
		
		System.out.print("Output : [");
		shiftZeros.printArray(output);
		System.out.print(" ]");	

	}

}
