package shivani.Coding_exam_14;

import java.util.ArrayList;

/*2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]*/
public class ReturnAllUniqueNoArray {

	public ArrayList<Integer> getUniqueNumbers(int words[]) {

		ArrayList<Integer> output = new ArrayList<Integer>();
		boolean isUnique = true;
		for (int i = 0; i < words.length; i++) {
			for (int index = 0; index < i; index++) {
				if (words[i] == words[index]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique == true) {
				output.add(words[i]);
			}
			isUnique = true;
		}
		return output;
	}

	public static void main(String[] args) {
		ReturnAllUniqueNoArray returnAllUniqueNoArray = new ReturnAllUniqueNoArray();
		int words[] = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> output = new ArrayList<Integer>();
		output = returnAllUniqueNoArray.getUniqueNumbers(words);
		System.out.println(output);

	}
}
