/*Program 4: write a program which will print characters between ascii value 97 to 122.*/

package shilpa.Assignment_18;

public class PrintCharOfGivenAsciifrom97To122 {
	void getCharFromAscii() {
		System.out.println("Characters between ascii value 97 to 122");
		for (int index = 97; index <= 122; index++) {
			char ch = (char) index;
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		PrintCharOfGivenAsciifrom97To122 printChar = new PrintCharOfGivenAsciifrom97To122();
		printChar.getCharFromAscii();
	}
}
