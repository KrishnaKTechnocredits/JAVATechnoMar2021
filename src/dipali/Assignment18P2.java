package dipali;

public class Assignment18P2 {
	
	public char getCharFromAsciiValue(int val) {
		char ch =(char) val;
		return ch;
	}

	public static void main(String[] args) {
		char ch =new Assignment18P2().getCharFromAsciiValue(98);
		System.out.println("character for given value 98 is "+ch);
	}

}
