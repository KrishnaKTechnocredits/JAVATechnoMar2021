package sandesh.Assignment_18;

public class PrintCharacters {
	
	void getCharacters() {
		System.out.println("Characters between Ascii value 97 - 122 are :- ");
		for (int i = 97; i <= 122; i++) {
			System.out.println((char)i);
		}
	}
	
	public static void main(String[] args) {
		PrintCharacters pc1 = new PrintCharacters();
		pc1.getCharacters();
	}
}
