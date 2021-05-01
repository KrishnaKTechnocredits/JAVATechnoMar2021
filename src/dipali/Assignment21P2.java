package dipali;

public class Assignment21P2 {
	public char getCharFromAsciiValue(int val) {
		return (char) val;
		
	}
	public static void main(String[] args) {
		char ch=new Assignment21P2().getCharFromAsciiValue(67);
		System.out.println("character for given value 67 is "+ch);
	}

}
