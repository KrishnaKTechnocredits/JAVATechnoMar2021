package krati_Jain.Assignment_22;

import java.util.Scanner;

public class StringArraycharFrequency {

	public static void main(String[] args) {
		StringArraycharFrequency strArrcharFreq = new StringArraycharFrequency();

		Scanner scn = new Scanner(System.in);

		System.out.println("Input a String of your choice: ");
		String myString = scn.next();
		System.out.println("Input a character who's frequency you want to know in String: ");
		String myCharInput = scn.next();
		char myChar = myCharInput.charAt(0);
		strArrcharFreq.oneCharFrequency(myString, myChar);

		System.out.println("\nInput a String of your choice: ");
		String myString2 = scn.next();
		strArrcharFreq.allCharFrequency(myString2);

		System.out.println("\nEnter the length of the Array you want to create");
		int defineArrLen = scn.nextInt();
		String[] myArr = new String[defineArrLen];
		System.out.println("\nEnter the elements of the array");
		for (int index = 0; index < defineArrLen; index++) {
			myArr[index] = scn.next();
		}
		strArrcharFreq.allCharFreqArray(myArr);
	}

	// Find one character frequency from given name.
	void oneCharFrequency(String myString, char myChar) {
		int index = 0;
		int count = 0;
		for (index = 0; index < myString.length(); index++) {
			if (myString.charAt(index) == myChar) {
				count++;
			}
		}
		System.out.println("'" + myChar + "' is " + count + " times in our string");
	}

	// Find all character frequency from given name.
	void allCharFrequency(String myString2) {
		for (int index = 0; index < myString2.length(); index++) {
			int count = 0;
			char charToVerify = myString2.charAt(index);
			if (myString2.indexOf(charToVerify) == index) {
				comparingWithString(myString2, charToVerify);
			}
		}
	}

	void comparingWithString(String myString2, char charToVerify) {
		int count = 0;
		int index = 0;
		for (index = 0; index < myString2.length(); index++) {
			if (charToVerify == myString2.charAt(index))
				count++;
		}

		System.out.println(charToVerify + "--> " + count + " in " + myString2);
	}

	void allCharFreqArray(String[] myArr) {
		System.out.println("\nChecking each character's frequency in each string of the array");
		for (int index = 0; index < myArr.length; index++) {
			String arrElementTemp = myArr[index];
			allCharFrequency(arrElementTemp);
			System.out.println("====================");
		}

	}

}
