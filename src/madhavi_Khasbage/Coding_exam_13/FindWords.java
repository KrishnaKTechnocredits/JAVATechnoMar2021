package madhavi_Khasbage.Coding_exam_13;

import java.util.ArrayList;
import java.util.Arrays;

/*2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka","aaakiidciou"]
output: ["aashay","madhavi","priyanka"]
*/

public class FindWords {

	public ArrayList<String> getVowels(String words[]) {
		ArrayList<String> arrStr = new ArrayList<String>();
		String strWord = "";
		char ch = ' ';
		int i = 0, cnt = 0;
		for (int index = 0; index < words.length; index++) {
			strWord = words[index].toLowerCase();
			int length=strWord.length();
			while (length > 0) {
				ch = strWord.charAt(i);
				if (isCharacterVowel(ch)) {
					cnt++;
				}				
				i++;
				length--;
			}			
			if (cnt > 2) {
				arrStr.add(strWord);
			}
			i=0;
			cnt=0;
		}
		return arrStr;
	}

	boolean isCharacterVowel(char x) {
		boolean isVowel = false;
		switch (x) {
		case 'a':
			isVowel = true;
			break;
		case 'e':
			isVowel = true;
			break;
		case 'i':
			isVowel = true;
			break;
		case 'o':
			isVowel = true;
			break;
		case 'u':
			isVowel = true;
			break;
		default:
			isVowel = false;
		}
		return isVowel;
	}

	public static void main(String[] args) {
		FindWords findWords = new FindWords();
		String[] strArr = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka","aaakiidciou" };
		System.out.println("input:" + Arrays.toString(strArr));
		ArrayList<String> strArrList= findWords.getVowels(strArr);
		System.out.println("Output:" + strArrList);
	}
}
