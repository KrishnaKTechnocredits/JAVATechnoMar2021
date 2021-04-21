package bhavana_assignment_21;
/*Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2 */

public class StringOperationsWithoutClassCharacter {

	int letterCount,digitCount,upperCount,lowerCount,specialCount;
	String input="1rRpd3F9#K(E";
	
	void stringOperations() {
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch>=65 && ch<=90)
				upperCount++;
			else if(ch>=97 && ch<=122)
				lowerCount++;
			else if(ch>=48 && ch<=57)
				digitCount++;
			else
				specialCount++;
		}
		System.out.println("Letter count:"+(upperCount+lowerCount)+"\nDigit Count:"+digitCount+"\nSpecial char count:"+specialCount+"\nUpper count:"+upperCount+"\nLower Count"+lowerCount);
	}
	public static void main(String[] args) {
		StringOperationsWithoutClassCharacter sc=new StringOperationsWithoutClassCharacter();
		sc.stringOperations();
	}
}
