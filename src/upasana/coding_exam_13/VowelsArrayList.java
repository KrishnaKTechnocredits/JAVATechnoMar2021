/*
 2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
//write your logic
}
 */

package upasana.coding_exam_13;

import java.util.ArrayList;
import java.util.Arrays;

public class VowelsArrayList {

	public ArrayList<String> getVowels(String[] input) {

		ArrayList<String> outputList = new ArrayList<String>();

		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(input));
		for (int index = 0; index < inputList.size(); index++) {
			int count = 0;
			String str = inputList.get(index);
			for (int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
				if (str.charAt(innerIndex) == 'a' || str.charAt(innerIndex) == 'e' || str.charAt(innerIndex) == 'i'
						|| str.charAt(innerIndex) == 'o' || str.charAt(innerIndex) == 'u')

					count++;
			}
			if (count > 2) {
				outputList.add(str);
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		String[] input = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		ArrayList<String> outputList = new VowelsArrayList().getVowels(input);
		System.out.println(outputList);
	}
}
