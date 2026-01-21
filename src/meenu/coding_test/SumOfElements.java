package meenu.coding_test;

import java.util.Arrays;

/*WAP to return the sum of all elements of an array, except ignore sections of numbers 
starting with 6 and extending to the next 9. Return 0 for No numbers.
input 1: [1,3,5]
output 1: 9

input 2 : [4,5,6,12,2,9,1,3]
output 2: 13

input 3 : [2,1,6,9,11,6,19,12,9,2]
output 3: 16

input 4 : [6,1,4,5,9]
output 4 : 0
*/

public class SumOfElements {
	
	static int getElementsSum(int[] array) {
		int sumOfElements = 0;
		boolean add  =true;
		for(int index = 0;index<array.length;index++) {	
			if(!(array[index]==6) && add== true)
				sumOfElements = sumOfElements+array[index];
			else if(array[index]==6)
				add= false;
			else if(array[index]==9)
				add =true;
		}
		return sumOfElements;
	}

	public static void main(String[] args) {		
		int[] array1 = {1,3,5};		
		int[] array2 = {4,5,6,12,2,9,1,3};
		int[] array3 = {2,1,6,9,11,6,19,12,9,2};
		int[] array4 = {6,1,4,5,9};
		int[][] finalArray = new int[4][4];
		finalArray[0] = array1;
		finalArray[1] = array2;
		finalArray[2] = array3;
		finalArray[3] = array4;
		
		for(int index =0;index<finalArray.length;index++) {
			System.out.println("Input -> " + Arrays.toString(finalArray[index]));
			int sum = getElementsSum(finalArray[index]);
			System.out.println("Output -> " +sum);
		}	
	}
}
