package ashwini.assignment26;
/*
 
Assignment - 26 : 19th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93

 */

public class ReturnStringWithMaxDigit {
	int GetToatlDigit(String input) {
		int count = 0;
		for(int index = 0; index<input.length(); index++) {
			if(Character.isDigit(input.charAt(index))) {
				count++;
			}
		}
		return count;
	}
	
	String StringWithMaxDigit(String[] array) {
		int  max = 0;
		String MaxDigit = "";
		for(int index = 0; index<array.length; index++) {
			int count = GetToatlDigit(array[index]);
			if(max<count) {
				max = count;
				MaxDigit = array[index];
			}
		}
		return MaxDigit;
	}

	public static void main(String[] args) {
		String array[] = {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"};
		ReturnStringWithMaxDigit stringWithMaxDigit = new ReturnStringWithMaxDigit();
		System.out.println(stringWithMaxDigit.StringWithMaxDigit(array));
		
	}

}
