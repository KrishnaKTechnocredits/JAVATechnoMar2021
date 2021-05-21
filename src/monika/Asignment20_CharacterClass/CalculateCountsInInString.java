package monika.Asignment20_CharacterClass;
/*Assignment 20 
 * 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/
public class CalculateCountsInInString {
	void getCountOFDiffValues(String input) {
		int digitCount=0, letterCount=0, upperCount=0, lowerCount=0, spaceCharCount=0,specialCharCount=0;
		
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index)))
				digitCount++;
			else if(Character.isLetter(input.charAt(index))) {
				letterCount++;
					if(Character.isUpperCase(input.charAt(index)))
						upperCount++;
					else if(Character.isLowerCase(input.charAt(index)))
						lowerCount++;
			}
			else if(Character.isSpaceChar(input.charAt(index)))
					spaceCharCount++;
			else
				specialCharCount++;
		}
		System.out.println("Total Digit Count : "+digitCount);
		System.out.println("Total Letter Count : "+letterCount);
		System.out.println("Total Upper Count : "+upperCount);
		System.out.println("Total Lower Count : "+lowerCount);
		System.out.println("Total SpaceChar Count : "+spaceCharCount);
		System.out.println("Total SpecialChar Count : "+specialCharCount);
		
	}
	public static void main(String[] args) {
		CalculateCountsInInString obj = new CalculateCountsInInString();
		obj.getCountOFDiffValues("1 rRpd3F9#K(E");
	}
}



