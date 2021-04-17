package aashay.FrequencyOfName;
/*
 * Assignment - 22 : 16th April'2021

Create a class with following functionality. [Estimated time: 40 mins]
a) Find one character frequency from given name.
Input: name - technocredits
character - e
Output : e -> 2 time in technocredits


 */

import java.util.Scanner;

public class FrequencyOfChar {

	void frequencyOfTargetChar(String name, char targetChar) {
		int targetCnt = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == targetChar) {
				targetCnt++;
			}
		}
		System.out.println("Target char" + targetChar + " frequency is:" + targetCnt);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrequencyOfChar frequencyOfChar = new FrequencyOfChar();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input Name:");
		String name = scan.next();
		System.out.println("Enter target character: ");
		char c = scan.next().charAt(0);

		frequencyOfChar.frequencyOfTargetChar(name, c);
		scan.close();

	}

}
