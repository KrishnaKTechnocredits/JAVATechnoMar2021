package dhanshri.Assignment_18;

public class AsciiToCharReturn {
	
	char getAsciiOfChar(int asciiValue) {
		return (char)asciiValue;
    }

	
	public static void main(String[] args) {
		char asciiTochar = new AsciiToCharReturn().getAsciiOfChar(66);
		System.out.println(asciiTochar);
	}
}
