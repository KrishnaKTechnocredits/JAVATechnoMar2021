/*
 Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2
*/


package priyanka_Panat.assignment16;

	import java.util.Scanner;

	public class FrequencyOfCharacter {
		
		void getCharFrequency(String str,char targetChar) {
			int count=0;
			for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==targetChar) 
				count++;
			}
			System.out.println("Frequency of character " + targetChar + " in given string " + str + " is : " + count);
		}
		
		public static void main(String[] args) {
			FrequencyOfCharacter frequencyOfCharacter=new FrequencyOfCharacter();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");
			String str1=sc.next();
			str1=str1.toUpperCase();
			System.out.println("Enter the character to find frequency from given string");
			char ch=sc.next().charAt(0);
			ch=Character.toUpperCase(ch);
			frequencyOfCharacter.getCharFrequency(str1,ch );
		}
	}

