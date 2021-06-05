package prachi.Coding_Exam_16;

/*Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};*/

import java.util.HashMap;

public class Program_1 {
	static int[] input = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };

	static HashMap<Integer, Integer> getFrequencyOfEachNum(int[] arr) {
		HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			int num = arr[index];
			if (output.containsKey(num))
				output.put(num, output.get(num) + 1);
			else
				output.put(num, 1);
		}
		return output;
	}

	public static void main(String[] args) {
		System.out.println("Frequency of each digit is as follows: ");		
		System.out.println(Program_1.getFrequencyOfEachNum(input));
	}
}