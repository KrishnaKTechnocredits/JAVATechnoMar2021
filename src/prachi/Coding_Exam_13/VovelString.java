package prachi.Coding_Exam_13;

import java.util.ArrayList;

/*2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
        //write your logic
}
 */

public class VovelString {
	static 	String[] str = { "aashay", "sandesh","madhavi","ankit","ami","priyanka", "prachii" };

	public static ArrayList<String> returnVovelStringElements(String[] strNames) {
		int count = 0;
		ArrayList<String> output = new ArrayList<String>();

		for (String name : strNames) {
			count = 0;
			for (int subIndex = 0; subIndex < name.length(); subIndex++) {
				char ch = name.charAt(subIndex);
				if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
					count++;
			}
			if (count > 2) {
				output.add(name);
			}
		}
		return output;
	}

	public static void main(String[] a) {
		ArrayList<String> output = VovelString.returnVovelStringElements(str);
		System.out.println("String Elements having more than two vowels are : "+output);
	}
}