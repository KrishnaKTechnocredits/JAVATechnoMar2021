package mayur.assignment18;

public class getAsciiValueOfChar {
	int getAsciiOfChar(char ch){
		return ch;
	}
	public static void main(String[] args) {
		getAsciiValueOfChar ascii = new getAsciiValueOfChar();
		int value = ascii.getAsciiOfChar('M');
		System.out.println("The Ascii value of given character is " +value);
	}
}
