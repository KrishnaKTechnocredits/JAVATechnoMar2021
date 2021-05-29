package mayur.coding_exam_14;

import java.util.ArrayList;

public class UniqueNumbers {
	public ArrayList<Integer> getUniqueNumbers(int words[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < words.length; index++) {
			int temp = words[index];
			if (!output.contains(words[index]))
				output.add(words[index]);
		}

		return output;
	}

	public static void main(String[] args) {
		UniqueNumbers unique = new UniqueNumbers();
		int arr[] = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> words = unique.getUniqueNumbers(arr);
		System.out.println("The unique numbers from the given array are: " + words);

	}
}
