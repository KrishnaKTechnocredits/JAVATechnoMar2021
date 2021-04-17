package mayur.assignment18;

public class AlphabetsAsciiValue {
	int getAsciiValues(char ch) {
		return ch;
	}
	public static void main(String[] args) {
		AlphabetsAsciiValue ascii = new AlphabetsAsciiValue();
		for(char ch = 'A';ch<='Z';ch++) {
			int value = ascii.getAsciiValues(ch);
			System.out.println("The Ascii Value of " +ch+ " is " +value );
		}
		
	}
		
}
		
