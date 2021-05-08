package kangan.assignments.assignment_16;

import java.util.Scanner;

public class CharFreq {

	void getCharFreq(String input,char temp) {
		int count = 0;
		for(int index=0;index<input.length();index++) {
		char ch = input.charAt(index);
		if(ch==temp) 
			count++;
	}
		System.out.println(count);
	}
	public static void main(String[] args) {
		CharFreq charFreq = new CharFreq();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:- ");
		String str = scanner.next();
		//String str = scanner.nextLine();
		System.out.println("Enter Character you want to check occurance");
		String str1 = scanner.next();
		char ch = str1.charAt(0);
		charFreq.getCharFreq(str, ch);
		scanner.close();
		
	}
}
