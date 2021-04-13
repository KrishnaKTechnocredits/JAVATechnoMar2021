package neha_Patil.Assignment_16;

import java.util.Scanner;

public class Frequency {

	
	void getCharFrequency(String str, char targetChar) {
		int count=0;
		str = str.toUpperCase();
		targetChar = Character.toUpperCase(targetChar);

		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == targetChar) {
				count++;
			}
		}
			System.out.println("frequency of character " + targetChar + " from string " + str + " is " + count);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Frequency frequency = new Frequency();
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		System.out.println("Enter the character you are looking for:");
		String chToCheck = sc.next();
		char targetChar = chToCheck.charAt(0);
		frequency.getCharFrequency(str, targetChar);
	
				  
	
		}

}
