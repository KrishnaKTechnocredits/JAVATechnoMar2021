package monika.Assignment19_CharacterClassMethods;
/*Assignment 19: 14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits*/
public class ComparisionBetweenUpperAndLowerChar {

	static String returnLargerCountString(String input) {
		int upperCaseCount = 0, lowerCaseCount = 0;
		for(int i = 0; i<input.length();i++) {
			if(Character.isUpperCase(input.charAt(i)))
				upperCaseCount++;
			/*else if(Character.isLowerCase(input.charAt(i)))
				lowerCaseCount++;*/
			else
				lowerCaseCount++;
		}
		if(upperCaseCount > lowerCaseCount)
			return "Techno";
		else if(upperCaseCount == lowerCaseCount)
			return "Both have equal counts";
		else
			return "Credits";
			
	}
	
	public static void main(String[] args) {		
		System.out.println(returnLargerCountString("MONA123aeio"));
	}

}
