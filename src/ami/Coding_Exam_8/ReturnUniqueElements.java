/*
 Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.
*/

package ami.Coding_Exam_8;

public class ReturnUniqueElements {

	int[] uniqNum() {
		int[] input = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] temp = new int[input.length];
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					flag = true;
				}
			}
			if (!flag) {
				if (count < input.length) {
					temp[count] = input[i];
					count++;
				}
			}
		}
		return temp;
	}

	public static void main(String[] a) {
		ReturnUniqueElements r1 = new ReturnUniqueElements();
		int[] output = r1.uniqNum();
		for (int index = 0; index < output.length && output[index] != 0; index++) {
			System.out.println(output[index]);
		}
	}
}
