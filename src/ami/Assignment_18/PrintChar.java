/*
 
Program 4:  write a program which will print characters between ascii value 97 to 122.
 
 */

package ami.Assignment_18;

public class PrintChar {

	void printCharValue() {
		for (int value = 97; value <= 122; value++) {
			char ch = (char) value;
			System.out.println("Character value of ASCII " + value + " is " + ch);
		}
	}

	public static void main(String[] args) {
		PrintChar asciiCharacter = new PrintChar();
		asciiCharacter.printCharValue();
	}

}
