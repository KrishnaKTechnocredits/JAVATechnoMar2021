package dipali;

public class Assignment18P1 {
	
	public int getAsciiValueOfGivenCharacter(char ch) {
			int ascii =(int) ch;
			return ascii;
	}

	public static void main(String[] args) {
		int val =new Assignment18P1().getAsciiValueOfGivenCharacter('a');
		System.out.println("Ascii value for given character a is "+val);
	}

}
