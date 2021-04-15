/*Program 1: Write a method which will 
 return "Techno" if Uppercase character count is higher then LowerCase character count
 Otherwise return "Credits". Print output in main method.*/


package krati_Shukla.ReturningValues;


public class UpperLowerCase {
	
	String CountUpperLower(String input) {
		int countUpper=0;
		int countLower=0;
		int length = input.length();
		for (int index=0; index<length; index++) {
			if(Character.isUpperCase(input.charAt(index)))
				countUpper++;
			else
				countLower++;
		}
		if (countUpper>countLower)
			return "Techno";
		else
			return "Credit";
	}
	
	public static void main (String[] a) {
		UpperLowerCase upperLowerCase = new UpperLowerCase();
		String input = "TeCHnoSessionS";
		String output = upperLowerCase.CountUpperLower(input);
		System.out.println(output);
	}

}
