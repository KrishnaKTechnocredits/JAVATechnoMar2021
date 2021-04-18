package anubhav.asciivalueprograms;

/*Program 4: write a program which will print characters between ascii value 97 to 122.*/

public class PrintCharactersOfAscii {
	
	public void allCharacter() {
		for (int i=65; i<=97; i++) {
			char ch= (char)i;
			System.out.println("Character corresponding to ASCII Value " + i + " is " + ch);
		}
	}
	
	public static void main (String[] args) {
		PrintCharactersOfAscii allCharcter = new PrintCharactersOfAscii();
		allCharcter.allCharacter();
	}
}
