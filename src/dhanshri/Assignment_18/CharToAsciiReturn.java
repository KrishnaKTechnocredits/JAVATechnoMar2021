package dhanshri.Assignment_18;

public class CharToAsciiReturn {
	
	int getAsciiOfChar(char ch) {
		return ch;
	}
	
	public static void main(String[] args) {
		
		CharToAsciiReturn charToAsciiReturn = new CharToAsciiReturn();
		int charValue = charToAsciiReturn.getAsciiOfChar('A');
		System.out.println(charValue);
	}

}
