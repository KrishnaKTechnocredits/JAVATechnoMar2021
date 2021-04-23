package ankit.assignment_18;

public class ReturnCharfromAsciiValue {

	char getCharofAscii(int asci) {
		char ch = (char)asci;
		return ch;
	}

	public static void main(String[] args) {
		ReturnCharfromAsciiValue returnCharfromAsciiValue = new ReturnCharfromAsciiValue();
		char ch = returnCharfromAsciiValue.getCharofAscii(122);
		System.out.println("Character is " + ch);	
	}		
}

