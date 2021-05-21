/*
Print the first non-repeated character of String.
Input : abcgbcah
output : g
 */
package ankit.coding_exam_10;

public class PrintFirstNonRepetChar {

	private boolean isNonDuplicate(String input , char ch) {
		int count = 0;
		for(int index = 0 ; index < input.length(); index++) {
			if(input.charAt(index) == ch) {
				count++;	
			}
		}
		if(count==1) {
			return true;
		}	
		return false;
	}

	public char firstNonRepeatChar(String input) {
		char firstNonRepChar = ' ';
		for(int index = 0 ; index < input.length(); index++) {
			char temp = input.charAt(index);
			boolean flag = isNonDuplicate(input , temp);
			if(flag) {
				firstNonRepChar = temp;
				break;
			}
		}
		return firstNonRepChar;
	}

	public char firstNonRepeatCharUsingMethod(String input) {
		char firstNonRepChar = ' ';
		for(int index = 0 ; index < input.length(); index++) {
			if(input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))) {
				firstNonRepChar = input.charAt(index);
				break;
			}	
		}
		return firstNonRepChar;
	}

	public static void main(String[] args) {
		String input = "abcgbcha";
		PrintFirstNonRepetChar printFirstNonRepetChar = new PrintFirstNonRepetChar();
		System.out.println("Using 2 Loops Method - Answer : "+printFirstNonRepetChar.firstNonRepeatChar(input));
		System.out.println("Using single loop and string in build Method - Answer : "+printFirstNonRepetChar.firstNonRepeatCharUsingMethod(input));
	}
}


