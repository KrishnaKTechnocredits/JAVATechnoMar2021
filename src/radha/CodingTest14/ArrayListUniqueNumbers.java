/*
2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
}
 */
package radha.CodingTest14;

import java.util.ArrayList;

public class ArrayListUniqueNumbers {

	public ArrayList<Integer> getUniqueNumbers(int words[]) {
		ArrayList<Integer> uniqueArr = new ArrayList<Integer>();
		for (int index = 0; index < words.length; index++) {
			boolean isUnique = false;
			for (int innerIndex = 0; innerIndex < index; innerIndex++) {
				if (words[index] == words[innerIndex]) {
					isUnique = true;
					break;
				}
			}
			if (!isUnique) {
				uniqueArr.add(words[index]);
			}
		}
		return uniqueArr;
	}

	public static void main(String[] args) {
		ArrayListUniqueNumbers uniq = new ArrayListUniqueNumbers();
		int[] input = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> uniqOut = uniq.getUniqueNumbers(input);
		System.out.println("Unique number from array : " + uniqOut);
	}
}