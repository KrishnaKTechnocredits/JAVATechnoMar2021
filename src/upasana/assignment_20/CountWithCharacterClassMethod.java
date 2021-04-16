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

package upasana.assignment_20;

import java.util.Scanner;
public class CountWithCharacterClassMethod {
	
	int countD,countL,countUC,countLC,countSC;
	
	void count(String str) {
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index)))
				countD++;
			else{
				if(Character.isUpperCase(str.charAt(index)))
					countUC++;
				else if(Character.isLowerCase(str.charAt(index)))
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
		new CountWithCharacterClassMethod().count(scanner.next());
		scanner.close();
	}
	
}
