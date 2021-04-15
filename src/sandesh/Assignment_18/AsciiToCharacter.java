package sandesh.Assignment_18;

public class AsciiToCharacter {
	
	char getAsciiOfChar(int asciiValue) {
		char ch = (char)asciiValue;
		return ch;
	}
	
	public static void main(String[] args) {
		AsciiToCharacter ac1 = new AsciiToCharacter();
		int ascii = 100;
		System.out.println(ac1.getAsciiOfChar(ascii));
	}
}
