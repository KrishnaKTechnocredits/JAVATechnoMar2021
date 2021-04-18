package monali.Assignment_18;

public class Program_2 {

	char getAsciiOfChar(int asciiValue) {
		char temp = (char) asciiValue;
		System.out.println("Ascii value of given char is " + temp);
		return temp;
	}

	public static void main(String[] a) {
		Program_2 program = new Program_2();
		int asciiValue = 47;
		program.getAsciiOfChar(asciiValue);

	}
}
