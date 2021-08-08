package gauravk.Assignment_21;
/*
2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
<Ref learning: www.theascicode.com.ar>

After Lecture - 14th_April_Session-23_Character_Class_Ascii_Value Assignment 21: 14th April'2021
Assignment 20 (both program) without using Character class method.
Note:
Complete Assignment 18th and 19th by today EOD.
Submit Assignment 20 and 21 by tomorrow EOD.
==========================================================
*/
import java.util.Scanner;

public class SumOfDigitsInString {
	int digitSum = 0;

	void countContent(String arg) {
		char [] ch = new char[arg.length()];
		for(int i=0; i<arg.length(); i++) {
			ch[i]=arg.charAt(i);
		}
		
		for(int i=0; i<arg.length(); i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				int n = ch[i]-'0';
				digitSum = digitSum + n;
			}
		}
		displayDigitSum();
	}

	void displayDigitSum() {
		System.out.println("Sum of digits in the string is : "+digitSum);
	}

	public static void main(String[] a) {
		new SumOfDigitsInString().countContent("J7yu9y8h1h8j4b7j3jjb6");;
		
	}
}