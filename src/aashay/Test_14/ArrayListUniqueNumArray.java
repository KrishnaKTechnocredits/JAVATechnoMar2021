package aashay.Test_14;

import java.util.ArrayList;

/*
 * 2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
}
 */
public class ArrayListUniqueNumArray {

	ArrayList<Integer> getUniquNumbers(int words[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int index = 0; index < words.length; index++) {
			if (!output.contains(words[index]))
				output.add(words[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayListUniqueNumArray arrayListUniqueNumArray = new ArrayListUniqueNumArray();
		int[] words = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> output = arrayListUniqueNumArray.getUniquNumbers(words);
		System.out.println("Unique numbers from given array are: " + output.toString());
	}

}
