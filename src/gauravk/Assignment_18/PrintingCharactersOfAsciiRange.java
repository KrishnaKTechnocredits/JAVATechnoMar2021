package gauravk.Assignment_18;
/*
 * After Lecture - 14th_April_Session-23_Character_Class_Ascii_Value Assignment 18 : 14th April'2021
Program 4: write a program which will print characters between ascii value 97 to 122.
 */
public class PrintingCharactersOfAsciiRange {
	void displayCharacterOfAscii() {
		for(int ch = 97; ch<=122; ch++) {
			System.out.println("Character of ASCII "+ch+ " is "+(char)ch);
		}
	}
	
	public static void main(String[] a) {
		new PrintingCharactersOfAsciiRange().displayCharacterOfAscii();
	}
}
