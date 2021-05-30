package sai.codingexam16;

import java.util.HashMap;

public class Divisibility {

	public static HashMap<Integer, Integer> DivisibleBy3(int[] input) {
		HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
		for (int index = 0; index < input.length; index++) {
			int tempNum = input[index];
			if (tempNum % 3 == 0) {
				if (output.containsKey(tempNum))
					output.put(tempNum, output.get(tempNum) + 1);
				else
					output.put(tempNum, 1);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Divisibility divisibility = new Divisibility();
		int[] input = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		HashMap<Integer, Integer> output = Divisibility.DivisibleBy3(input);
		System.out.println("Numbers and the frequency of divisibility by 3 is ");
		System.out.println(output);
	}

}
