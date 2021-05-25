package renuka.exam13;

/*2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]
public ArrayList<String> getVowels(String words[]){
	//write your logic
*/

import java.util.ArrayList;

public class WordWithMoreThanTwoVowels {
	
	public static void main(String[] args) {
		String[] strArr = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		ArrayList<String> strList = new ArrayList<String>();
		for (int index = 0; index < strArr.length; index++)
			strList.add(strArr[index]);
		System.out.println("Input list is : " + strList);
		WordWithMoreThanTwoVowels moreThan2Vowels = new WordWithMoreThanTwoVowels();
		System.out.println("The input list has following elements with more than 2 vowels : "
				+ moreThan2Vowels.vowelValidation(strList));

	}

	ArrayList<String> vowelValidation(ArrayList<String> strList) {
		ArrayList<String> outputStr = new ArrayList<String>();
		for (String str : strList) { // aashay
			int count = 0;
			str.toLowerCase();
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index); // a
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					count++;
				if (count > 2) {
					outputStr.add(str);
					break;
				}
			}
		}
		return outputStr;
	}

}
