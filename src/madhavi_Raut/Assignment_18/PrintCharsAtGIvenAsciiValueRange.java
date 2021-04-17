package madhavi_Raut.Assignment_18;
//Program 4: write a program which will print characters between ascii value 97 to 122. 

public class PrintCharsAtGIvenAsciiValueRange {

	void displayCharsAtGIvenAsciiValueRange(int startIndex, int endIndex) {
		System.out.println("Below are the chars at given ascii values:");
		for (int index = startIndex; index <= endIndex; index++) {
			System.out.println("Character at ascii value " + index + " is " + (char) index);
		}
	}

	public static void main(String[] args) {
		new PrintCharsAtGIvenAsciiValueRange().displayCharsAtGIvenAsciiValueRange(97, 122);
	}
}
