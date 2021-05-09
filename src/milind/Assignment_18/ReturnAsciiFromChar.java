package milind.Assignment_18;

public class ReturnAsciiFromChar {
	
	int getCharOfAscii(char ch) {
		int asciiValueint=(int)ch;
		return asciiValueint;
	}

	public static void main(String[] args) {
		ReturnAsciiFromChar returnAsciiFromChar=new ReturnAsciiFromChar();
		int asciiValue=returnAsciiFromChar.getCharOfAscii('A');
		System.out.println("Ascii Value is " + asciiValue  );
	}

}
