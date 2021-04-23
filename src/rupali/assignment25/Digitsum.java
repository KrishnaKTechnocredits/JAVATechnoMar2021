/*
 * Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
 */
package rupali.assignment25;

import java.util.Scanner;



public class Digitsum {
	int isnumber(String s) {
		int count=0;
		int sum=0,j=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				j=Character.getNumericValue(ch);
			}
			sum=sum+j;
		}
		return sum;
	}	
	
	public static void main(String[] args) {
		Digitsum digitsum=new Digitsum();
		String[] input = {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"};
		int sum;
		for(int i=0;i<input.length;i++) {
				sum=digitsum.isnumber(input[i]);
				System.out.println("The sum of digits present in the string "+input[i]+" is "+sum);
			}	
	}


}
