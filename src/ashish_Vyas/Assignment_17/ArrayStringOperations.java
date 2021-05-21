/*
WAP for Requirment 8 and 9 : for Assignment_17 
Program 8: return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits

Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2

 */

package ashish_Vyas.Assignment_17;

import java.util.Scanner;
public class ArrayStringOperations {

	private static Scanner scanner;

	void valuesInArray(String[] arrayWord) {
		System.out.println("**** WORDS IN ARRAY*****");
		for(int index = 0; index<arrayWord.length;index++) {
			System.out.println(arrayWord[index]+ " ");
		}
	}

	String getMaxLengthWord(String[] arrayWord) {
		System.out.println("****BIGGEST WORD IN ARRAY*****");
		String biggestWord = arrayWord[0];
		for(int index = 1; index<arrayWord.length;index++) {
			if(biggestWord.length() < arrayWord[index].length()) {
				biggestWord = arrayWord[index];
			}
		}	
		return biggestWord;	
	}

	String getMinLengthWord(String[] arrayWord) {
		System.out.println("****SMALLEST WORD IN ARRAY*****");
		String smallestWord = arrayWord[0];
		for(int index = 1; index<arrayWord.length;index++) {
			if(smallestWord.length() > arrayWord[index].length()) {
				smallestWord = arrayWord[index];
			}
		}	
		return smallestWord;	
	}

	int getMaxLengthWordIndex(String[] arrayWord) {
		System.out.println("**** BIGGEST WORD INDEX*****");
		String biggestWord = arrayWord[0];
		int biggestWordIndex = 0;
		for(int index = 1; index<arrayWord.length;index++) {
			if(biggestWord.length() < arrayWord[index].length()) {
				biggestWordIndex = index;
			}
		}	
		return biggestWordIndex;	
	}

	public static void main(String[] args) {
		ArrayStringOperations arrayStringOperations = new ArrayStringOperations();
		scanner = new Scanner(System.in);
		System.out.println("Enter the number of words you want in String Array :");
		int size = scanner.nextInt();
		if(size <0) {
			System.out.println("Enter valid value for array size");
		}
		else {
			String[] arrString = new String[size];
			for (int index = 0 ; index <arrString.length; index++) {
				System.out.println("Enter "+(index+1)+ " word to add in array :");
				arrString[index] = scanner.next();
			}
			arrayStringOperations.valuesInArray(arrString);
			String bigWord = arrayStringOperations.getMaxLengthWord(arrString);
			System.out.println("Biggest Word in Array is :"+bigWord);
			String smallWord = arrayStringOperations.getMinLengthWord(arrString);
			System.out.println("Smallest word in Array is : "+smallWord);
			int biggestWordIndex = arrayStringOperations.getMaxLengthWordIndex(arrString);
			System.out.println("Biggest word in Array located at Index :"+biggestWordIndex);

		}

	}
}