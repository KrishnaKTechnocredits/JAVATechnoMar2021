package mayur.assignment18;

public class CharactersAsciiValues {
	char getAsciiValues(int asciiValue) {
		return (char)asciiValue;
	}
	
	public static void main(String[] args) {
		CharactersAsciiValues ascii = new CharactersAsciiValues();
		for(int  i = 65;i<= 122;i++) {
			char value = (char) ascii.getAsciiValues(i);
			System.out.println("The Character of Ascii Value of " +i+ " is " +value );
		}
	
	}	

}
	
