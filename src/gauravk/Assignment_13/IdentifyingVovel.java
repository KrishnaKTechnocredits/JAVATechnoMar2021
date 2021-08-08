package gauravk.Assignment_13;

import java.util.Scanner;

/*
 * After Lecture - 7th_April_Session-17_Switch_Case_How_SOP_works Assignment - 13 : 7th April'2021
WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
sample input2 : I
sample output2 : I is a vowel
sample input3 : i
sample output3 : i is a vowel
 */
public class IdentifyingVovel {
	
	void isVovel(char ch) {
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch+" is vovel");
			break;
		default: System.out.println(ch+" is not vovel");
		}
	}
	
		public static void main(String[] arg) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter character");
			new IdentifyingVovel().isVovel(sc.next().charAt(0));
		}
}