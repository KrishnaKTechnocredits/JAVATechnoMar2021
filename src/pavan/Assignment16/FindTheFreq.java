/*
 Find the frequency of character from a given String array.
Note: Take String and character from the user using scanner class.

Input : technocredits
char : e
output : e -> 2
 */

package pavan.Assignment16;

import java.util.Scanner;

public class FindTheFreq {
	int count=0;
	
	void charFreq(String str, char ch) {
		
		String name = str.toLowerCase();
		char letter = Character.toLowerCase(ch);
	
		for (int index=0;index<str.length();index++) {
			if (str.charAt(index)==ch)
			{
				//System.out.println(str.charAt(index));
			count++;
			}
		}
		System.out.println("Freq of Charactor "+ ch +"is"+ count);
		
	
	}

	public static void main(String[] args) {
		FindTheFreq findTheFreq=new FindTheFreq();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=scanner.nextLine();
		System.out.println("Ether the number whose frequency is to be identified");
		char ch= scanner.next().charAt(0);
		System.out.println(ch);
		findTheFreq.charFreq(str,ch);
		
	}
}
