package monika.Assignment18_AsciiValues;
/*Assignment 18 : 14th April'2021
Program 1: Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)

Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)
 
Program 3: write a method which will print ascii value of A to Z.

Program 4: write a program which will print characters between ascii value 97 to 122.*/
public class ReturnAsciiValueOfChar {
	
	static int getAsciiOfChar(char ch) {
		int i = ch;
		return i;
	}
	
	static char getCharOfAscii(int num) {
		char ch = (char)num;
		return ch;
	}
	
	static void getCharacterfAllAscii() {
		for(int i = 97;i<=122;i++) {
			char ch = (char)i;
			System.out.println(ch);
		}
	}
		
	static void getAsciiValueOfAllChars() {
		for(int i = 65;i<=90;i++) {
			char ch = (char)i;
			int asciivalue = ch;
			System.out.println("\n"+asciivalue);
		}
	}
	public static void main(String[] args) {
		int i = getAsciiOfChar('a');
		System.out.println("Ascii value of given char is "+i);
		
		char ch = getCharOfAscii(97);
		System.out.println("Character of given Ascii value is "+ch);
		
		getAsciiValueOfAllChars();
		
		getCharacterfAllAscii();
	}

}
