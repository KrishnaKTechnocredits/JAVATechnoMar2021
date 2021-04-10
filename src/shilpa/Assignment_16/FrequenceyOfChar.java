package shilpa.Assignment_16;

import java.util.Scanner;

public class FrequenceyOfChar {
	String str;
	char ch;

	void charFrequency(String str,char targetchar) {
		int count = 0;
		int length = str.length();
		for(int index=0;index<length;index++)
		{
			if(str.charAt(index)==targetchar)
			count++;
		}
		System.out.println("Frequencey of character '"+targetchar+"' in String '"+str+"' is "+count);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FrequenceyOfChar ch = new FrequenceyOfChar();
		System.out.println("Enter the String");
		String str1 = scanner.nextLine();
		System.out.println("Enter Target character");
		String str2 = scanner.next();
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		char targetchar=str2.charAt(0);
		ch.charFrequency(str1,targetchar);
		scanner.close();
	}
}
