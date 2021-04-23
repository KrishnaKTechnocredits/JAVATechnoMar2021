package bhavana_assignment_20;
/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2 */

public class StringMethodsUse {
	
	int totalDigit,letterCount,upperCaseCount,lowerCaseCount,specialCharCount,digitCount;
	
	void stringOperations(String input) {
		
	for(int index=0;index<input.length();index++) {
		char ch=input.charAt(index);
		if(Character.isLetter(ch)) {
			if(Character.isUpperCase(ch)) {
				upperCaseCount++;
				letterCount++;	
			}else {
				lowerCaseCount++;
				letterCount++;	
				}	
		}
		if(Character.isDigit(ch))
			digitCount++;	
		else
			specialCharCount++;
	    }
    }
	public static void main(String[] args) {
		StringMethodsUse smt=new StringMethodsUse();
		smt.stringOperations("1rRpd3F9#K(E");
		System.out.println("The count of Letters:"+smt.letterCount+"\nUppercase count is:"+smt.upperCaseCount+
				"\nlower case count is:"+smt.lowerCaseCount+"\ndigit count is:"+smt.digitCount+"\nSpecial char count:"+smt.specialCharCount);
							
	}
}