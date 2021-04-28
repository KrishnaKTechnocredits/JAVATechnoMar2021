package kangan.assignments.assignment_21;

/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
Without using char class*/

public class CountWithoutCharClass {

	void getCaseCountWithoutChar(String str) {
		int digitCount = 0;
		int lettercount = 0;
		int upperChCount = 0;
		int lowerChCount = 0;
		int specialChar = 0;

		for (int index = 0; index < str.length(); index++) {
         char ch = str.charAt(index);

			if (ch>='0' && ch <= '9')
				digitCount++;

			 if ((ch>='A' && ch <= 'Z') || (ch>='a' && ch <= 'z'))
				lettercount++;

			 if (ch>='A' && ch <= 'Z')
				upperChCount++;

			 if (ch>='a' && ch <= 'z')
				lowerChCount++;
			
			else
			 specialChar =  ( str.length() - lettercount-digitCount);
		}

		System.out.println("Total digit:" + digitCount + "\n" + "Total Letters:" + lettercount + "\n" + "Total Uppercase:" + upperChCount + "\n"+ "Total Lowercase:" +lowerChCount + "\n"+ "Total Special char:" + specialChar);
	}
	public static void main(String[] args) {
		CountWithoutCharClass countWithoutCharClass = new CountWithoutCharClass();
		countWithoutCharClass.getCaseCountWithoutChar("1rRpd3F9#K(E");
		
	}
}
