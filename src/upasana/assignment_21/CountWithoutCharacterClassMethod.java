/*
1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
 */
package upasana.assignment_21;

import java.util.Scanner;

public class CountWithoutCharacterClassMethod {
	int countD,countUC,countLC,countSC;
	
	void count(String str) {
		for(int index=0;index<str.length();index++) {
			int asciiVal=str.charAt(index);
			if(asciiVal>=48 && asciiVal<=57)
				countD++;
			else {
				if(asciiVal>=65 && asciiVal<=90)
					countUC++;
				else if(asciiVal>=97 && asciiVal<=122)
					countLC++;
				else
					countSC++;
			}
		}
		System.out.println("Total digits : "+countD);
		System.out.println("Total letters : "+(countUC+countLC));
		System.out.println("Total UpperCase : "+countUC);
		System.out.println("Total LowerCase : "+countLC);
		System.out.println("Total Special Char : "+countSC);
			
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input");
		String str=scanner.next();
		new CountWithoutCharacterClassMethod().count(str);
		scanner.close();
	}
	
}
