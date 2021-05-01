package anubhav.StringOperations;

import java.util.Scanner;

/*Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
		String msg = "Te1Ch2noCr4e_%$d8iTs9"
		output : 12489TCCTehnoredis
 */

public class SortingOfCharactersInAString {

	String sortingOfElements(String input) {
		String digitsInString    = ""; 
		String uppercaseInString = ""; 
		String lowercaseInString = ""; 
		
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				digitsInString = digitsInString + input.charAt(index);
			}else if (Character.isUpperCase(input.charAt(index))) {
				uppercaseInString = uppercaseInString + input.charAt(index);
			}else if (Character.isLowerCase(input.charAt(index))){
				lowercaseInString = lowercaseInString + input.charAt(index);	
			}
		}
		String output= (digitsInString+uppercaseInString+lowercaseInString);
		return output;
	}
	

	public static void main(String[] args) {
		SortingOfCharactersInAString sortingOfCharactersInAString = new SortingOfCharactersInAString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input string : ");
		String input = scanner.nextLine();
		sortingOfCharactersInAString.sortingOfElements(input);
		String temp= sortingOfCharactersInAString.sortingOfElements(input);
		System.out.println(temp);
		scanner.close();
		
	}
}
