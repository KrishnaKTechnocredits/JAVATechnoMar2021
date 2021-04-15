/*Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits
*/

package sourabh.stringExamples2;

public class UpperAndLowerCase {
	String getUpperAndLowerCase(String str) {
		int upperCount=0, lowerCount=0;
		for(int index=0; index<str.length(); index++) {
			char ch= str.charAt(index);
			if(Character.isUpperCase(ch))
				upperCount++;
			else
				lowerCount++;
		}
		if(upperCount>lowerCount)
			return "Techno";
		else
			return "Credits";
	}
	public static void main(String[] args) {
		UpperAndLowerCase upperAndLowerCase= new UpperAndLowerCase();
		String str1= upperAndLowerCase.getUpperAndLowerCase("TeCHnoSessionS");
		System.out.println("input : TeCHnoSessionS");
		System.out.println("Output : "+str1);
	}
}
