package kangan.assignments.assignment_18;

/*Program 2:  Write a method which will return character of given Ascii value.*/

public class ReturnChofAscii {

	char getAsciiOfChar(int asciiValue) {
		char ch = (char) (asciiValue);	
		return ch ;
	}
	public static void main(String[] args) {
		ReturnChofAscii returnChofAscii = new ReturnChofAscii();
		returnChofAscii.getAsciiOfChar(100);
		System.out.println(returnChofAscii.getAsciiOfChar(100));
	}
}
