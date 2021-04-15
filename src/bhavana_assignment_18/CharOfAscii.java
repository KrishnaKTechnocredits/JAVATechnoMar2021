package bhavana_assignment_18;
/*Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue) */

public class CharOfAscii {

	char ascii;
	
	char getCharOfAscii(int asciiValue) {
		ascii=(char)asciiValue;
		return ascii;
	}

	public static void main(String[] args) {
		CharOfAscii ca=new CharOfAscii();
		ca.getCharOfAscii(78);
		System.out.println("Character of ascii value is:"+ca.ascii);
	}
}

