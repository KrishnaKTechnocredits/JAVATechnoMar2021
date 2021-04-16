/*Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2 
*/

package ravindra_J.Assignment_No_21_withoutCharacterMethod;

public class CountCharTypeWithoutCharMehtod {

	static int letterCount=0,upperCount=0,lowerCount=0,digitCount=0,specialCount=0;
	
	public static void main(String[] args) {
		String str = "1rRpd3F9#K(E";
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				upperCount++;
			else if(ch >= 'a' && ch <= 'z')
				lowerCount++;
			else if(ch >= '0' && ch <= '9')
				digitCount++;
			else
				specialCount++;
		}
		letterCount = upperCount+lowerCount;
		System.out.println("Total digit: " +digitCount+ 
				"\nTotal Letters: "+letterCount+ 
				"\nTotal Uppercase: "+upperCount+
				"\nTotal Lowercase: "+lowerCount+
				"\nTotal Special char: "+specialCount);

	}

}
