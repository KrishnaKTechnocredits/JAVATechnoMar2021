package sandesh.Assignment_18;

public class CharacterAscii {
	
	int getAsciiOfChar(char chData) {
		int asciiChar = chData;
		return asciiChar;
	}
	
	public static void main(String[] args) {
		CharacterAscii ca1 = new CharacterAscii();
		char ch = 'd';
		System.out.println(ca1.getAsciiOfChar(ch));
	}
}
