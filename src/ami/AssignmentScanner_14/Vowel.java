/*
 Using scanner class. 
 
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel
*/

package ami.AssignmentScanner_14;

import java.util.Scanner;

public class Vowel {
	void isVowel(String ch) {
		switch(ch) {
		case"a":
		case"A":
			System.out.println( ch +" is a vowel");
			break;
		case "E":
		case "e":
			System.out.println(ch + " is a vowel");
			break;
		case "i":
		case "I":
			System.out.println(ch + " is a vowel");
			break;
		case "o":
		case "O":
			System.out.println(ch + " is a vowel");
			break;
		case "U":
		case "u":
			System.out.println(ch + " is a vowel");
			break;
		default: 
			System.out.println(ch + " is not a vowel");
		}
	}
	
	public static void main(String[] a) {
		Vowel vo = new Vowel();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Alphabate: ");
		String line = sc.next();
		vo.isVowel(line);
	}
}
