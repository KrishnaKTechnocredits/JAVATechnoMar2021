/*
 Assignment 19W/o char method

 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
 */

package pavan.Assignment_21;

import java.util.Scanner;

public class CountWoChar {

	int digits;
	int uppercase;
	int lowercase;
	int letters;
	int specialchar;
	void countDetails(String input){

		for(int index=0; index<input.length();index++) {
			char ch= input.charAt(index);
			int chi= (int)ch;
		if(chi>=48 && chi<=57) {
				digits++;	 	
			}
			else if (chi>=65 && chi<=90) 
				uppercase++;	 	
			
			else if(chi>=97 && chi<=122) 
				lowercase++;	 	
			
			
			else if(chi>=97 && chi<=122) 
				lowercase++;	 	
			
			else 
				specialchar++;
		}	 

		int letters= uppercase+ lowercase;
		System.out.println("Total Digits are :"+ digits);
		System.out.println("Uppercase values are: "+uppercase);
		System.out.println("Lowecase Values are: "+lowercase);
		System.out.println("Total lettest are "+letters);
		System.out.println("Special Char's are "+specialchar);
		}
	

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String");
		String in=scan.next();
		CountWoChar countWoChar= new CountWoChar();
		countWoChar.countDetails(in);
	}

}
