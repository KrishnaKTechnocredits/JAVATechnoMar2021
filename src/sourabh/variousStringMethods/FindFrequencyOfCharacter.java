package sourabh.variousStringMethods;

import java.util.Scanner;

public class FindFrequencyOfCharacter {
	void getFrequencyOfCharacter(String str, char targetCh) {
		int count=0;
		str= str.toUpperCase();
		targetCh= Character.toUpperCase(targetCh);
		for(int index=0;index<str.length();index++) {
		if(str.charAt(index)== targetCh)
			count++;
		}
		System.out.println("Count of "+targetCh+" is: "+count);
	}
	public static void main(String[] args) {
		FindFrequencyOfCharacter frequency= new FindFrequencyOfCharacter();
		//frequency.getFrequencyOfCharacter("ABacd", 'a');
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str= scanner.next();			
		System.out.println("Enter any Character: ");
		char targetCh= scanner.next().charAt(0);
		frequency.getFrequencyOfCharacter(str, targetCh);
	}
}
