package technocredits.tricky;

public class StringLetter {

	public static void main(String[] args) {
		String input = "te12ch*";
		int upperCaseCount=0,lowerCaseCount=0,letterCount=0,digitCount=0,specialCharCount=0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			}else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}else if (Character.isDigit(ch))
				digitCount++;
			else
				specialCharCount++;
			
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch))
					upperCaseCount++;
				else
					lowerCaseCount++;
				letterCount++;
			}else if(Character.isDigit(ch)){
				digitCount++;
			}else {
				specialCharCount++;
			}
		}
		int[] arr = new int[3];
		
		
		System.out.println(letterCount);
	}
}
