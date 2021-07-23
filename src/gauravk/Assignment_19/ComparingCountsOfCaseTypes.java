package gauravk.Assignment_19;
/*
 * After Lecture - 14th_April_Session-23_Character_Class_Ascii_Value Assignment 19: 14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.
input : TeCHnoSessionS
output : Credits
 */
public class ComparingCountsOfCaseTypes {
	String compareCaseTypes(String str) {
		int upperCount=0, lowerCount=0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i)))
				upperCount++;
			else lowerCount++;
		}
		if(upperCount>lowerCount)
			return "Techno";
		else return "Credits";
	}
	
	public static void main(String[] a) {
		String output = new ComparingCountsOfCaseTypes().compareCaseTypes("TeCHnoSessionS");
		System.out.println(output);
	}

}
