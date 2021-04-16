package dhanshri.Assignment_21;

public class CharacterCount {

	int uppercasecount = 0;
	int lowerCaseCount = 0;
	int digit = 0;
	int specialCharacter;

	void charCount(String input) {
		for (int index = 0; index < input.length(); index++) {

			 char ch = input.charAt(index);
			if (ch >= 65 && ch <= 90)
				uppercasecount++;
			else  if (ch >= 97 &&  ch <= 122)
				lowerCaseCount++;
			else if (ch >= 48 && ch <= 57)
				digit++;
			else 
				specialCharacter++;
			}
		
	}
	
	void display() {
		System.out.println("UpperCase cpunt : " +uppercasecount);
		System.out.println("LowerCase count : "+lowerCaseCount);
		System.out.println("Digit count: " +digit);
		System.out.println("Letter count is: " + (uppercasecount +lowerCaseCount));
		System.out.println("Special character count is: " +specialCharacter);
	}
public static void main(String[] args) {
	CharacterCount characterCount = new CharacterCount();
	characterCount.charCount("1rRpd3F9#K(E");
	characterCount.display();
}
}
