/*Assignment 18 : 14th April'2021

Program 4:  write a program which will print characters between ascii value 97 to 122.*/

package simmi.assignment_18_Ascii;

public class AsciiCharacter {
	void printCharacterValue() {
		for (int value = 97; value <= 122; value++) {
			char ch = (char)value;
			System.out.println("Character value of ASCII " + value + " is " + ch);
		}
	}

	public static void main(String[] args) {
		AsciiCharacter asciiCharacter = new AsciiCharacter();
		asciiCharacter.printCharacterValue();
	}
}
