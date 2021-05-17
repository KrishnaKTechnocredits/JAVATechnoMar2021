/*
Test -8 : [Complexity : Easy]

input = {10,2,3,10,3,55,61,2};

output : {10,2,3,55,61};
*/
package kajal.Codingexam;

public class ReturnArrayNumbers {

	int[] returnArray(int[] input) {
		int[] output = new int[input.length];
		int innerIndex = 0;

		for (int index = 0; index < input.length; index++) {

			for (innerIndex = 0; innerIndex < index; innerIndex++)
				if (input[index] == input[innerIndex])
					break;
			if (index == innerIndex)
				output[index] = input[index];

		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] output = new ReturnArrayNumbers().returnArray(input);
		for (int index = 0; index < output.length; index++) {
			if (output[index] != 0)
				System.out.println(output[index] + " ");
		}
	}
}
