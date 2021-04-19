//Scanner Class

/*
Assignment - 13 : 7th April'2021

WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
 
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel
*/

package upasana.assignment_14;

import java.util.Scanner;

public class Vowels {
	void switchEx(char ch) {
		switch(ch){
			case 'A' :  
			case 'a' :
				System.out.println(ch+" is a vowel");
				break;
			case 'E' :  
			case 'e' :
				System.out.println(ch+" is a vowel");
				break;
			case 'I' :  
			case 'i' :
				System.out.println(ch+" is a vowel");
				break;
			case 'O' :  
			case 'o' :
				System.out.println(ch+"  is a vowel");
				break;
			case 'U' :  
			case 'u' :
				System.out.println(ch+" is a vowel");
				break;
			default : 
				System.out.println(ch + " is not a vowel");
		}
	}
	
	
	public static void main(String[] args) {
		Vowels vowels = new Vowels();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input : ");
		char ch = scanner.next().charAt(0);
		vowels.switchEx(ch);
		
		System.out.println(" Enter input : ");
		char var = scanner.next().charAt(0);
		vowels.switchEx(var);
		
		System.out.println(" Enter input : ");
		char st = scanner.next().charAt(0);
		vowels.switchEx(st);
		
	}
}
