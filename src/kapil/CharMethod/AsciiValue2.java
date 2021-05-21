/*P2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)
*/
package kapil.CharMethod;

public class AsciiValue2 {

	char getAsciiofChar(int num) {

		System.out.println(+num);
		return (char) num;
	}

	public static void main(String[] args) {
		AsciiValue2 asciival2 = new AsciiValue2();
		asciival2.getAsciiofChar(80);

	}
}
