package madhavi_Khasbage.CharacterClass;

/*write a program which will print characters between ascii value 97 to 122.*/

public class PrintCharOfAscii {
	void getChar() {
		for (int index = 97; index <= 122; index++) {
			char ch = (char)index;
			System.out.println("\n Character of ascii value " + index + " is: " + ch);
		}
	}

	public static void main(String[] args) {
		PrintCharOfAscii pntChar = new PrintCharOfAscii();
		pntChar.getChar();
	}
}
