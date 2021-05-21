/*
 * 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53

----------------------------------------------------------------------
 */
package rupali.assignment20;

public class Charactercount {
	
	 public static void main(String[] args) {
		System.out.println("Input : 1rRpd3F9#K(E");
		String input="1rRpd3F9#K(E";
		int ucount=0;
		int lcount=0;
		int numcount=0;
		int scount=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if( Character.isUpperCase(ch))
				ucount++;
			else if(Character.isLowerCase(ch))
					lcount++;
				else if(Character.isDigit(ch))
					numcount++;
				     else
				    	 scount++;
	
		}
		System.out.println("Total Upper case :"+ucount);
		System.out.println("Total Lower case :"+lcount);
		System.out.println("Total Digit :"+numcount);
		System.out.println("Total special symbol :"+scount);
	}

}
