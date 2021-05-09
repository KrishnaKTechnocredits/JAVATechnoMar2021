package milind.Assignment_18;

public class AsciiValueChar {
	
	void getAsciiValueAToZ(String alphabet) {
		int ascii=0;
		char[]alpha=alphabet.toCharArray();
		for(int index=0;index < alphabet.length();index++) {
			ascii=(int)alpha[index];
			System.out.println("for "+ alpha[index] +"Ascii value is "+ ascii);
			
		}
	}
	public static void main(String[] args) {
		 AsciiValueChar  asciiValueChar=new  AsciiValueChar();
		 asciiValueChar.getAsciiValueAToZ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
}
