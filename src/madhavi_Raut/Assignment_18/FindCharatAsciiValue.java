package madhavi_Raut.Assignment_18;
/*Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)*/

public class FindCharatAsciiValue {
	char getAsciiOfChar(int asciiValue) {
		return (char) asciiValue;
	}

	public static void main(String[] args) {
		System.out.println("Character at given ascii value is: " + new FindCharatAsciiValue().getAsciiOfChar(70));
	}
}
