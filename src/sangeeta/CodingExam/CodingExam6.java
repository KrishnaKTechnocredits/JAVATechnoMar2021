/*Find a Character having a maximum frequency.

input : globant india is hiring

output : i*/

package sangeeta.CodingExam;

import java.util.Scanner;

public class CodingExam6 {

	char getMaxRepeatingChar(String str) {
		int maxCount = 1;
		char maxChar = str.charAt(0);
		for (int index = 0; index < str.length(); index++) {
			int count = 1;
			char ch = str.charAt(index);
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				for (int inneri = index + 1; inneri < str.length(); inneri++) {
					if ((String.valueOf(str.charAt(inneri))).equals(String.valueOf(ch))) {
						count++;
					}
				}
				if (count > maxCount) {
					maxCount = count;
					maxChar = str.charAt(index);
				}
			}
		}
		return maxChar;
	}

	public static void main(String[] args) {
		CodingExam6 codingExam6 = new CodingExam6();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string is");
		String str = sc.nextLine();
		System.out.println("Max reapiting character is " + codingExam6.getMaxRepeatingChar(str));

	}

}
