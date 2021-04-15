/*
Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user using scanner class.

Input : technocredits
char : e
output : e -> 2
*/

package amruta.Assignment_16;

import java.util.Scanner;

class FrequencyofChar{
	
	void printCharacter(String str, char selectedchar){
		
		int count=0;
		//String length = str.length();
	
		str=str.toUpperCase();
		selectedchar=Character.toUpperCase(selectedchar);
		
		for(int index=0; index<str.length(); index++){ 						 //we can use  index < lentgh if store "String lentgh= str.lentgh(); "
			if(str.charAt(index)==selectedchar){
				count++;
			}
		}
					System.out.println("\nFrequency of character " + selectedchar + " in given string " + str + " is : " + count);
	}
	
	public static void main(String[] args){
		FrequencyofChar frequency = new FrequencyofChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter String :");
		String str = scanner.nextLine();
		
		//String input = scanner.next();
		//char ch =input.charAt(0);
		
		System.out.println("--------------------------------");
		
		System.out.println("\nEnter character : ");
		char ch = scanner.next().charAt(0); 		// Best Practice
		System.out.println("--------------------------------");
		frequency.printCharacter(str,ch);
	}
}
