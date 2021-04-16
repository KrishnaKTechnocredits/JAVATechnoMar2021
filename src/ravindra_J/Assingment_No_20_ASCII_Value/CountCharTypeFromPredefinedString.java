/*Assignment 20:  14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
*/

package ravindra_J.Assingment_No_20_ASCII_Value;

public class CountCharTypeFromPredefinedString {

	public static void main(String[] args) {
		int digitCount=0,upperCount=0,lowerCount=0,specialCount=0;
		String str = "T%^78*():+n@h!T$Y?E.c?~`Lkaj";
		
						for(int index=0;index < str.length();index++){
							char ch = str.charAt(index);
							if(Character.isDigit(ch))
								digitCount++;
							else if(Character.isUpperCase(ch))
								upperCount++;
							else if(Character.isLowerCase(ch))
								lowerCount++;
							else 
								specialCount++;
							
						}
		int letterCount = upperCount+lowerCount;
		System.out.println("Total digit: " +digitCount+ "\nTotal Letters: "+letterCount+ "\nTotal Uppercase: "+upperCount+"\nTotal Lowercase: "+lowerCount+
				"\nTotal Special char: "+specialCount);

	}
}