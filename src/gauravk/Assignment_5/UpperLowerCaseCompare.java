package gauravk.Assignment_5;
/*#5

Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". 
Print output in main method.

input : TeCHnoSessionS
output : Credits
+
------USER DEFINED INPUT--------
*/

import java.util.Scanner;

public class UpperLowerCaseCompare {
	
	int countUpper = 0;
	int countLower = 0;
	String result;
	
	String caseCount(char [] input, int len) {
		for(int i = 0; i<len; i++) {
			if(input[i]>=65 && input[i]<=90)
				countUpper++;
			if(input[i]>=96 && input[i]<=122)
				countLower++;
		}
		if(countUpper>countLower) {
			System.out.println("Uppercase characters are more than lowercase characters.");
			return "Techno";
		}
		else if(countUpper<countLower) {
			System.out.println("Lowercase characters are more than uppercase characters.");
			return "Credits";
		}
		else {
			System.out.println("Both uppercase and lowercase characters are in equal ammount.");
			return "";
		}
	}
	
	void dataCollect() {
		Scanner sc = new Scanner(System.in);
		String abc = sc.next();
		char [] sentence= new char [abc.length()];
		int length = sentence.length;
		for(int i=0; i<abc.length(); i++) {
			sentence[i] = abc.charAt(i);
		}
		result = caseCount(sentence, length);
	}
	
	public static void main(String[] a) {
		UpperLowerCaseCompare upperLowerCaseCompare1 = new UpperLowerCaseCompare();
		upperLowerCaseCompare1.dataCollect();
		System.out.println(upperLowerCaseCompare1.result);
	}
}
