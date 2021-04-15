package bhavana_assignment_18;
/*write a program which will print characters between ascii value 97 to 122*/

public class AsciiToChar {
	char ch;
	void getCharactersOfAscii() {
		for(int index=97;index<=122;index++) {
			ch=(char)index;
			System.out.println(index+" :is ascii of "+ch);
		}
	}
	
	public static void main(String[] args) {
		AsciiToChar ac=new AsciiToChar();
		ac.getCharactersOfAscii();
	}
}
