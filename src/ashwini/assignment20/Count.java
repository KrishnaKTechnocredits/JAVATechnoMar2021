package ashwini.assignment20;
/*	
 Assignment 20:  14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

 */

public class Count {
	void getCount(String str) {
		int upperCaseCount = 0, lowerCaseCount=0,digitCount=0, letterCount=0,spaceCharCount=0,sum=0;
		for(int index=0; index<str.length(); index++) {
	        if(Character.isUpperCase(str.charAt(index))) {
	        	upperCaseCount++;
	        }
	    }
	    System.out.println("upperCase count in String is :"+upperCaseCount);
	    for(int index=0; index<str.length(); index++) {
	        if(Character.isLowerCase(str.charAt(index))) {
	        	lowerCaseCount++;
	        }
	    }
	    System.out.println("lowerCase count in String is :"+lowerCaseCount);
	    for(int index=0; index<str.length(); index++) {
	        if(Character.isDigit(str.charAt(index))) {
	        	digitCount++;
	        }
	    }
	    System.out.println("digit count in String is :"+digitCount); 
	    for(int index=0; index<str.length(); index++) {
		    if(Character.isLetter(str.charAt(index))) {
		          letterCount++;
		     }
		}
	    System.out.println("letter count in String is :"+letterCount);
	    
	}

	public static void main(String[] args) {
		Count count = new Count();
		count.getCount("1rRpd3F9#K(E");

	}

}
