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

package pavan.Assignment_20;

import java.util.Scanner;

public class CountDetails {

	void findDetails(String input){
		int isDigit=0;
		int isupper=0;
		int islowcase=0;
		int isspecialchar=0;
		
		for(int index=0;index<input.length();index++){
			char ch= input.charAt(index);
			if(Character.isDigit(ch))
				isDigit++;
			else if(Character.isUpperCase(ch))
				isupper++;
			else if(Character.isLowerCase(ch))
				islowcase++;
			else 
				isspecialchar++;
		}
		int totalLetter= isupper+islowcase;
		
		System.out.println("have Total Digits:= "+isDigit+"\n"+"Have UpeerCases:= "+isupper+"\n"+ "Lower cases:= "+islowcase+"\n"+"Total Letter:= "+totalLetter+"\n"+"Special char:="+ isspecialchar);
	}

	public static void main(String[] args) {
		CountDetails countDetails= new CountDetails();
		countDetails.findDetails("1rRpd3F9#K(E");
	}
}
