/*
 * Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2
 */
package rupali.assignment16;
import java.util.Scanner;

public class Stringoperation {
	int frequencyofchar(String s,char targetchar) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==targetchar)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Stringoperation stringoperation=new Stringoperation();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a word");
		String str=scanner.next();
		System.out.println("Enter a character to find out frequency in given word");
		String str1=scanner.next();
		char c=str1.charAt(0);
		int cnt=stringoperation.frequencyofchar(str, c);
		System.out.println("The letter '"+c+"' found in the word  '"+str+"' is "+cnt);
	}
}
