/*Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)*/
package pravin.Assignment_18;
public class AsciiToCharReturn {
	
	char getAsciiOfChar(int asciiValue) {
		return (char)asciiValue;
    }

	
	public static void main(String[] args) {
		char asciiTochar = new AsciiToCharReturn().getAsciiOfChar(87);
		System.out.println(asciiTochar);
	}
}