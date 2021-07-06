package gauravk.Assignment_6;
/*
#6

2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53


<Ref learning: www.theascicode.com.ar>
*/
import java.util.Scanner;

public class SumOfDigitsInString {
	String inp = "";
	char [] ch = new char[inp.length()];
	int digitSum = 0;
		
	void inputKeystrokes() {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		ch = new char [inp.length()];
		
		for(int index=0; index<inp.length(); index++) {
			ch[index] = inp.charAt(index);
		}
		countContent(ch);
	}
	
	void countContent(char [] arg) {
		for(int i=0; i<arg.length; i++) {
			if((int)arg[i]>=48 && (int)arg[i]<=57) {
				digitSum = digitSum + Character.getNumericValue(arg[i]);
			}
		}
		displayDigitSum();
	}
	
	void displayDigitSum() {
		System.out.println("Sum of digits in the string is : "+digitSum);
	}
	
	public static void main(String[] a) {
		SumOfDigitsInString sumOfDigitsInString1 = new SumOfDigitsInString();
		sumOfDigitsInString1.inputKeystrokes();
	}
}