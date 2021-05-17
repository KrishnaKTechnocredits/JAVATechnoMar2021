/*Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.*/

package sangeeta.CodingExam;

public class CodingExam8_P1 {

	int[] getUniqueNumbers(int[] arr) {
		int[] output = new int[arr.length];
		boolean dulicatenum = false;
		for (int index = 0; index < arr.length; index++) {
			dulicatenum = false;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex])
					dulicatenum = true;
			}
			if (dulicatenum == false)
				output[index] = arr[index];
		}
		return output;
	}

	public static void main(String[] args) {
		CodingExam8_P1 codingExam8_P1 = new CodingExam8_P1();
		int[] arr = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] output = codingExam8_P1.getUniqueNumbers(arr);
		for (int index = 0; index < output.length; index++) {
			if (output[index] != 0)
				System.out.println(output[index]);
		}
	}
}
