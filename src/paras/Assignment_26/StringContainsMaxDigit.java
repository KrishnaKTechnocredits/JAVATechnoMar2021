/*
Assignment - 26 : 19th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
 */

package paras.Assignment_26;

public class StringContainsMaxDigit {
	
	String maxdigitString(String[] arr) {
		
		int maxCount = 0;
		int digitCount = 0;
		String maxDigitString = "";
		
		for(int index = 0; index < arr.length; index++) {
			String arr1 = arr[index];
			for(int innerindex = 0; innerindex < arr1.length(); innerindex++) {
				char ch = arr1.charAt(innerindex);
				if(Character.isDigit(ch)) {
					digitCount++;
				}
			}
			if(maxCount < digitCount) {
				maxCount = digitCount;
				maxDigitString = arr1;
			}
		}
		return maxDigitString;
	}
	
	public static void main(String[] args) {
		StringContainsMaxDigit stringContainsMaxDigit = new StringContainsMaxDigit();
		String [] arr =  {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"};
		String MaxString = stringContainsMaxDigit.maxdigitString(arr);
		System.out.println("string containing maximum digits in an array is " + MaxString);
	}
}
