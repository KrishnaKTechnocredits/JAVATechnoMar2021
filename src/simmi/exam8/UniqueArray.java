/*Programming Test - 8 :

Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.*/

package simmi.exam8;

public class UniqueArray {
	int[] array(int[] input) {

		int[] temp = new int[5];
		int index = 0;
		for (int num = 0; num < input.length; num++) {
			boolean isNumberMissing = true;
			for (int innerIndex = num + 1; innerIndex < input.length; innerIndex++) {
				if (input[num] == input[innerIndex]) {
					isNumberMissing = false;
					break;
				}
			}
			if (isNumberMissing == true) {
				temp[index] = input[num];
				index++;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		int[] input = { 10, 2, 3, 10, 3, 55, 61, 2 };
		UniqueArray uniqueArray = new UniqueArray();
		int[] output = uniqueArray.array(input);
		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index] + " ");
		}
	}
}
