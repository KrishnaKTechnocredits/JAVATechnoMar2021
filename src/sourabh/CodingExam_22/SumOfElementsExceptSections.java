/*
WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.

input 1: [1,3,5]

output 1: 9

input 2 : [4,5,6,12,2,9,1,3]

output 2: 13

input 3 : [2,1,6,9,11,6,19,12,9,2]

output 3: 16

input 4 : [6,1,4,5,9]

output 4 : 0
 */
package sourabh.CodingExam_22;

public class SumOfElementsExceptSections {

	int getSum(int[] arrInput) {
		int sum = 0;
		boolean isSum= true;
		for (int index = 0; index < arrInput.length; index++) {
			if (arrInput[index] == 6)
				isSum= false;
			else if(arrInput[index] == 9)
				isSum= true;
				
			else if ((arrInput[index] != 6 || arrInput[index] != 9) && isSum==true) {
				sum = sum + arrInput[index];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		SumOfElementsExceptSections sumOfElements = new SumOfElementsExceptSections();
		int[] arrInput = {2,1,6,9,11,6,19,12,9,2};
		int output = sumOfElements.getSum(arrInput);
		System.out.println(output);
	}

}
