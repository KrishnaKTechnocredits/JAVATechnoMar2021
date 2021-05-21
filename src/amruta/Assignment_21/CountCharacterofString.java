/*  Assignment 21: 14th April'2021  Without using Character Class Methods

Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

*/


package amruta.Assignment_21;

class CountCharacterofString {
	
	void getcountofValues(String input){
		int uppercasecount=0 , lowercasecount=0, digitcount = 0, specialcharcount = 0;
		
		for (int indexU=0 ; indexU<input.length(); indexU++) {
			
			char ch = input.charAt(indexU);   // Each index of string stored in character  so it will compare with ascii values
			if(ch>=65 && ch<=90)
				uppercasecount++;
		}	
		System.out.println("upper Case Count = " +uppercasecount);	
		
		for (int indexL=0 ; indexL<input.length(); indexL++) {
			if(input.charAt(indexL)>=97 && input.charAt(indexL)<=122)
				lowercasecount++;
		}
		System.out.println("Lower case Count = "+lowercasecount);
		
		int lettercount =uppercasecount + lowercasecount;
		System.out.println("Letters Count = "+lettercount);
		
		for (int indexC=0 ; indexC<input.length(); indexC++) {
			if(input.charAt(indexC)>=48 && input.charAt(indexC)<=57)
				digitcount++;
		}	
		System.out.println("Digit Count = " +digitcount);
		
//		for (int indexS=0 ; indexS<input.length(); indexS++) {
//			if(input.charAt(indexS)>=32 && input.charAt(indexS)<=64)
//				specialcharcount++;
//		}
//		System.out.println("Special Character Count = " +specialcharcount);
	}
		
	public static void main(String[] args){
	
		String str = "1rRpd3F9#K(E";
		new CountCharacterofString().getcountofValues(str);
	
	}
}