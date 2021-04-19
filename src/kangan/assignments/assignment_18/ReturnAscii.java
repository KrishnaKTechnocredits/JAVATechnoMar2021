package kangan.assignments.assignment_18;

public class ReturnAscii {

	int getAsciiOfChar(char ch) {
		int num = ch;
		return num;
	}
	public static void main(String[] args) {
		ReturnAscii returnAscii =  new ReturnAscii();
		int asciiValue = returnAscii.getAsciiOfChar('d');
		System.out.println(asciiValue);
	}
}
