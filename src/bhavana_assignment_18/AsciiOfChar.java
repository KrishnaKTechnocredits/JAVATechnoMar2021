package bhavana_assignment_18;

/*Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch) */


public class AsciiOfChar {

	int ascii;
	int getAsciiOfChar(char ch) {
		ascii=ch;
		return ascii;
	}
	
	
	public static void main(String[] args) {
		AsciiOfChar ac=new AsciiOfChar();
		ac.getAsciiOfChar('a');
		System.out.println("The ascii value of character is:"+ac.ascii);
	}
	
}
