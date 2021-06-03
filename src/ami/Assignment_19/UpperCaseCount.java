/*
Program 1: Write a method which will return "Techno" if Uppercase character count 
is higher then LowerCase character count, otherwise return "Credits". Print output 
in main method.

input : TeCHnoSessionS
output : Credits

 */

package ami.Assignment_19;

public class UpperCaseCount {
	static int upperCount;
	static int lowerCount;

	static String word() {
		if (upperCount > lowerCount) {
			System.out.println("Uppercase character count is higher");
			return "Techo";
		} else {
			System.out.println("Lowercase character count is higher");
			return "Credits";
		}
	}

	static String countWord(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch))
				upperCount++;
			else
				lowerCount++;
		}
		return word();
	}

	public static void main(String[] args) {
		String str1 = "TeCHnoSessionS";
		String output = countWord(str1);
		System.out.println(output);
	}
}