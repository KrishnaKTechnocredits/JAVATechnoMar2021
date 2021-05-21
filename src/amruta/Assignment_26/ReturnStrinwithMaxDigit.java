/*  Assignment - 26 : 19th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93 */

package amruta.Assignment_26;

public class ReturnStrinwithMaxDigit {
	
	String printStringWithMaxDigit(String[] input) {
		int maxDigit = 0;
		
		String maxDigitstring = input[0];
		
		for(int index=0; index<input.length; index++) {
			
			int digitCount = 0;
			
			for(int innerIndex=0; innerIndex<input[index].length(); innerIndex++) {
				char ch= input[index].charAt(innerIndex);
				
				if(Character.isDigit(ch))
					digitCount++;
			}
			if(digitCount > maxDigit) {
				maxDigit = digitCount;
				maxDigitstring = input[index];
			}
		}
		return maxDigitstring;
	}
	
	public static void main(String[] args) {
		
		String[] str = {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"} ;
		
		System.out.print("String which contains Maximum Digits : ");
		
		String string = new ReturnStrinwithMaxDigit().printStringWithMaxDigit(str);
		
		System.out.println(string);
	}
}
