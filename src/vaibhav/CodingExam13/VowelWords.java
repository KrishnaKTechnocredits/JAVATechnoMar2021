/* Coding Exam - 13 : 25th May'2021 : Collection

2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
//write your logic
}

*/

package vaibhav.CodingExam13;

import java.util.ArrayList;

public class VowelWords {

	public ArrayList<String> getVowels(String[] words) { // aashay

		ArrayList<String> outputArrList = new ArrayList<String>();

		for (int index = 0; index < words.length; index++) {

			String name = words[index].toLowerCase();
			int count = 0;
			for (int innerIndex = 0; innerIndex < name.length(); innerIndex++) {

				char ch = name.charAt(innerIndex);

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					count++;
			}

			if (count > 2)
				outputArrList.add(words[index]);

		}

		return outputArrList;
	}

	public static void main(String[] args) {

		VowelWords vowelWords = new VowelWords();

		String[] inputArr = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };

		ArrayList<String> outputArrList = new ArrayList<String>();

		outputArrList = vowelWords.getVowels(inputArr);

		System.out.println("Expected ArrayList with words having more than 2 vowels is :");
		System.out.println(outputArrList);
	}

}
