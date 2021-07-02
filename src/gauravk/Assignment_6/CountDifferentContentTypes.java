package gauravk.Assignment_6;

/*
 #6

1) Count Digits, Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
 */

import java.util.Scanner;

public class CountDifferentContentTypes {
	String inp = "";
	int inputLength = 0;
	char [] ch = new char[inp.length()];
	int digitCount = 0;
	int letterCount = 0;
	int upperCaseCount = 0;
	int lowerCaseCount = 0;
	int specialCount = 0;
	
	void inputKeystrokes() {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		inputLength = inp.length();
		ch = new char [inputLength];
		
		for(int index=0; index<inputLength; index++) {
			ch[index] = inp.charAt(index);
		}
		countContent(ch, inputLength);
	}
	
	void countContent(char [] arg, int length) {
		for(int i=0; i<length; i++) {
			if((int)arg[i]>=48 && (int)arg[i]<=57) {
				digitCount++;
			}else if(((int)arg[i]>=32 && (int)arg[i]<=47) || ((int)arg[i]>=58 && (int)arg[i]<=64) || ((int)arg[i]>=91 && (int)arg[i]<=96) || ((int)arg[i]>=123 && (int)arg[i]<=126)) {
				specialCount++;
			}else if((int)arg[i]>=65 && (int)arg[i]<=90) {
				letterCount++;
				upperCaseCount++;
			}else {
				letterCount++;
				lowerCaseCount++;
			}
		}
		displayContentsTypesCounts();
	}
	
	void displayContentsTypesCounts() {
		System.out.println("Total digits : "+digitCount);
		System.out.println("Total letters : "+letterCount);
		System.out.println("Total uppercase characters : "+upperCaseCount);
		System.out.println("Total lowercase characters : "+lowerCaseCount);
		System.out.println("Total special characters : "+specialCount);
	}
	
	public static void main(String[] a) {
		CountDifferentContentTypes countDifferentContentTypes1 = new CountDifferentContentTypes();
		countDifferentContentTypes1.inputKeystrokes();
	}

}
