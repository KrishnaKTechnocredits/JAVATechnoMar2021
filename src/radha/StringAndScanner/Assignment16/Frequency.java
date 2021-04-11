/*Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2
 */

package radha.StringAndScanner.Assignment16;

import java.util.Scanner;

public class Frequency {
	
	void getFrequency(String str, char targetChar) {
		int counter=0;
		str = str.toUpperCase();
		targetChar = Character.toUpperCase(targetChar);
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index) == targetChar) 
				counter++;
		}
		System.out.println("Frequency of the character "+targetChar+" in the string "+str+" is: "+counter);
	}
	
	public static void main(String[] args) {
		Frequency frequency = new Frequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		System.out.println("Enter the target character whose frequency is to be determined:");
		char targetCh = sc.next().charAt(0);
		frequency.getFrequency(str, targetCh);
		sc.close();
	}
}
