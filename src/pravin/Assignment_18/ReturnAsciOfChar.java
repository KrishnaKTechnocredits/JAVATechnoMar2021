/*Program 1: Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)*/


	package pravin.Assignment_18;
	
	public class ReturnAsciOfChar {
		int getAsciiOfChar(char ch) {
			return ch;
		}
		public static void main(String[] args) {
	
			ReturnAsciOfChar returnAsciOfChar = new ReturnAsciOfChar();
			int charValue = returnAsciOfChar.getAsciiOfChar('Z');
			System.out.println(charValue);
		}
	}