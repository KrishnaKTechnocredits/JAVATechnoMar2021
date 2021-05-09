package milind.Assignment_18;

public class ReturnCharFromAscii {
	char getCharOfAscii(int ascii) {
		char ch=(char)ascii;
		return ch;
	}
	public static void main(String[] args) {
		ReturnCharFromAscii returnCharFromAscii=new ReturnCharFromAscii();
		char ch=returnCharFromAscii.getCharOfAscii(122);
		System.out.println("Character is " + ch);
	}

}
