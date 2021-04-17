package anubhav.arrayexamples;

//Frequency Of All Characters From Each Name In Array
import java.util.Scanner;

import anubhav.StringOperations.FrequencyOfAllCharactersInAString;

public class FrequencyOfAllCharactersFromEachNameInArray{

	void InAllNames(String[] input) {

		FrequencyOfAllCharactersInAString frequencyOfAllCharactersInAString = new FrequencyOfAllCharactersInAString();
		int length = input.length;
		for(int i=0; i<length; i++) {
			String string1 = input[i];
			String str =string1.toLowerCase();
			for(int index=0; index<str.length(); index++) {
				char ch = str.charAt(index);
				if(str.indexOf(ch) == index)
					frequencyOfAllCharactersInAString.Frequency(ch, str);
			}
		}
	}


	public static void main(String[] a) {
		FrequencyOfAllCharactersFromEachNameInArray frequencyOfAllCharactersFromEachNameInArray = new FrequencyOfAllCharactersFromEachNameInArray();
	/*	Scanner scanner= new Scanner(System.in);
		System.out.println("Enter length of array : ");		
		int length=scanner.nextInt();
		String [] array= new String [length];
			for (int index=0; index<length; index++) {
				System.out.println("Enter string " + (index+1) + " of array :");
				array[index]=scanner.next(); */
		String[] userInputArray = {"ANubhav", "Baiswar", "Anu", "Bais", "AnubhavBaiswar"};
		frequencyOfAllCharactersFromEachNameInArray.InAllNames(userInputArray);
	}

}

// Hey Harsh, can you help me understand how do I initialize the array using scanner in this case, i tried but could not so provided direct user input