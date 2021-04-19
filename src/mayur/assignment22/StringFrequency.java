package mayur.assignment22;

import java.util.Scanner;

public class StringFrequency {

	void charFreq(String input) {

		for (int index = 0; index < input.length(); index++) {
			char targetChar = input.charAt(index);
			if (input.indexOf(targetChar) == index)
				frequencyOfChar(input, targetChar);
		}
	}

	void frequencyOfChar(String input, char targetChar) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (targetChar == input.charAt(index))
				count++;
		}
		System.out.println(targetChar + " is " + count + " time in " + input);
	}



	public static void main(String[] args) {
		StringFrequency string = new StringFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = scanner.nextLine();
		string.charFreq(input);
		scanner.close();
	}



		
		
	}
		

	

	
	

