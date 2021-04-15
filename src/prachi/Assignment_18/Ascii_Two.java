package prachi.Assignment_18;

/*Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)
*/

public class Ascii_Two {
	
	char getAsciiOfChar(int asciiValue){
		return (char)asciiValue;
	}
	
	public static void main(String[] args) {
		Ascii_Two asTwo = new  Ascii_Two();
		char value = (char) asTwo.getAsciiOfChar(76);
		System.out.println("The character of ascii value is : " +value);
	}

}
