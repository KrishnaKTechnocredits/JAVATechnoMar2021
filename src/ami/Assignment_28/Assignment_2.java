/*
Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
 */

package ami.Assignment_28;

public class Assignment_2 {

	String checkCharacterTypeInString(String str) {
		String digit = "", lower = "", upper = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				digit = digit + str.charAt(index);
			} else if (Character.isLowerCase(str.charAt(index))) {
				lower = lower + str.charAt(index);
			} else if (Character.isUpperCase(str.charAt(index))) {
				upper = upper + str.charAt(index);
			}
		}
		return (digit + upper + lower);
	}

	public static void main(String[] args) {
		Assignment_2 assignment_2 = new Assignment_2();
		String str1 = "Te1Ch2noCr4e_%$d8iTs9";
		System.out.println("Output 1 :" + assignment_2.checkCharacterTypeInString(str1));

	}

}
