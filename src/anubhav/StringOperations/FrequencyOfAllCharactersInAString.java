package anubhav.StringOperations;

import java.util.Scanner;

/*Frequency of all characters in a string*/

public class FrequencyOfAllCharactersInAString {

	public void Frequency(char ch, String string1) { 
		String str= string1.toLowerCase();
		int count=0;
		int length = str.length();
		for(int index=0; index<length; index++) {
			if(str.charAt(index) == ch)
				count++;
		}
		System.out.println(ch+ " -> "+count+ " time in "+str);
	}

	void CheckIndex(String string1) {

		String str=string1.toLowerCase();
		int length = str.length();
		for(int index=0; index<length; index++){
			char ch = str.charAt(index);
			if (str.indexOf(ch) == index)
				Frequency(ch, str);
		}
	}

	public static void main(String[] a) {
		FrequencyOfAllCharactersInAString frequencyOfAllCharactersInAString = new FrequencyOfAllCharactersInAString();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter string : ");
		String input= scanner.nextLine();
		frequencyOfAllCharactersInAString.CheckIndex(input);
		scanner.close();
	}

}