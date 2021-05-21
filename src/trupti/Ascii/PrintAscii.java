package trupti.Ascii;


public class PrintAscii {
	void printAsciiOfAtoZ(char [] cArray) {
		System.out.println("Character" + " : " + "Ascii Value");
		for(int index=0;index<cArray.length;index++) {
			int ascii = cArray[index];
			System.out.println(cArray[index] + " : " + ascii);
		}

	}

	public static void main(String[] args) {
		PrintAscii printascii=new PrintAscii();
		char [] charArray = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; 
		printascii.printAsciiOfAtoZ(charArray);

	}

}
