package madhavi_Raut.Assignment_18;

/*Program 1: Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)*/

public class FindAsciiValueOfChar {

	int getAsciiOfChar(char ch) {
		return ch;
	}

	public static void main(String[] args) {
		System.out.println("Ascii value of given char is: " + new FindAsciiValueOfChar().getAsciiOfChar('M'));
	}
}
