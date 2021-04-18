package aashay.FrequencyOfName;
/*
 * Assignment - 22 : 16th April'2021

b) Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1

 */

import java.util.Scanner;

public class FrequencyOfAllChar {

	void allCharFrequency(String name) {
		for (int index = 0; index < name.length(); index++) {
			char c = name.charAt(index);
			if (name.indexOf(c) == index) {
				frequencyOfTargetChar(name, name.charAt(index));
			}
		}
	}

	void frequencyOfTargetChar(String name, char targetChar) {
		int targetCnt = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == targetChar) {
				targetCnt++;
			}
		}
		System.out.println("Target char " + targetChar + " frequency is:" + targetCnt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrequencyOfAllChar frequencyOfAllChar = new FrequencyOfAllChar();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter input name:");
		String name = scan.next();
		frequencyOfAllChar.allCharFrequency(name);
		scan.close();

	}

}
