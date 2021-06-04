package prachi.Coding_Exam_16;

/*Program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
*/

import java.util.HashMap;

public class Program_2 {
	static int[] input = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };

	static HashMap<Integer, Integer> frequencyOfNumbersDivBy3(int[] arr) {
		HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			int num = arr[index];
			if (num % 3 == 0) {
				if (output.containsKey(num))
					output.put(num, output.get(num) + 1);
				else
					output.put(num, 1);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		System.out.println("freq of only numbers div by 3 is : ");
		System.out.println(Program_2.frequencyOfNumbersDivBy3(input));
	}
}
