//Find the frequency of character from a given String array.

package krati_Shukla.ScannerClass;

import java.util.Scanner;

public class CharFrequency {
	
	 int count; 
	 
	void checkFrequency(char ch, String input, int length) {
		for(int index = 0; index<length; index++) {
			char ch1 = input.charAt(index);
			if(ch == ch1) {
				count++;
			}
		}
		System.out.println("Occurance of "+ch+" is "+count+ " times");
	}
	
	
	public static void main(String[] a) {
		CharFrequency charFrequency = new CharFrequency();
		Scanner scanner = new Scanner(System.in);
						
		System.out.println("Enter Name");
		String input = scanner.next();
		input = input.toUpperCase();
		int length = input.length();
		
		System.out.println("Enter the character you need find");
		String letter = scanner.next();
		letter = letter.toUpperCase();
		char ch = letter.charAt(0);
		charFrequency.checkFrequency(ch, input, length);		
		
	}

}