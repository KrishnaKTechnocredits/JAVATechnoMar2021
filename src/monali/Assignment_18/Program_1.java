package monali.Assignment_18;

public class Program_1 {

	int getAsciiOfChar(char ch) {
		char ch1 = ch;
		System.out.println("Ascii value of given char is " + ch1);
		return ch1;
	}

	public static void main(String[] a) {
		Program_1 program = new Program_1();
		char ch = 76;
		program.getAsciiOfChar(ch);

	}
}
