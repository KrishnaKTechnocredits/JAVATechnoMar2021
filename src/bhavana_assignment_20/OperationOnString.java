package bhavana_assignment_20;



/* Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/
public class OperationOnString {
	
	int digitCount,letterCount,upperCount,lowercount,specialCount;
	String input="1rRpd3F9#K(E";
	char ch;
	
	void stringOperations() {
	
		for(int index=0;index<input.length();index++) {
			if(Character.isUpperCase(input.charAt(index))) 
					upperCount++;
			else if(Character.isLowerCase(input.charAt(index)))
				lowercount++;
			else if(Character.isDigit(input.charAt(index)))
					digitCount++;
		}
		specialCount=input.length()-(upperCount+lowercount+digitCount);
	}
	
	void display() {
		System.out.println("Letter count:"+(upperCount+lowercount)+"\nUpper count:"+upperCount+"\nLower count:"+lowercount+"\nDigit count:"+digitCount+
				"\nSpecial Char Count:"+specialCount);

	}
	
	public static void main(String[] args) {
		OperationOnString os=new OperationOnString();
		os.stringOperations();
		os.display();
	}
}