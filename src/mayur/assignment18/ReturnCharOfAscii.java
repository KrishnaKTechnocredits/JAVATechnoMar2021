package mayur.assignment18;

public class ReturnCharOfAscii {
	char returnCharOfAscii(int asciiValue){
		return (char)asciiValue;
	}
	public static void main(String[] args) {
		 ReturnCharOfAscii ascii = new  ReturnCharOfAscii();
		char value = (char) ascii.returnCharOfAscii(97);
		System.out.println("The Ascii character of given value is " +value);
	}


}
