package trupti.Ascii;

public class PrintCharacter {
	void printChar() {
		int startvalue=97;
		System.out.println("Character" + " : " + "Ascii Value");
		for(int i=0;i<=25;i++) {
			int value=startvalue+i;
			char ch1=(char)value;
			System.out.println(value+ " : "+ch1);
		}
	}
	

	public static void main(String[] args) {
		PrintCharacter printcharacter=new PrintCharacter();
		printcharacter.printChar();

	}

}
