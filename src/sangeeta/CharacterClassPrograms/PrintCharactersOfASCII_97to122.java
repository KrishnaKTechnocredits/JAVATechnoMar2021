package sangeeta.CharacterClassPrograms;

public class PrintCharactersOfASCII_97to122 {

	void printCharOf_97to122() {
		for (int index = 97; index >= 97 && index <= 122; index++) {
			char temp = (char) index;
			System.out.println(index + "->" + temp);
		}
	}

	public static void main(String[] a) {
		PrintCharactersOfASCII_97to122 printCharactersOfASCII_97to122 = new PrintCharactersOfASCII_97to122();
		printCharactersOfASCII_97to122.printCharOf_97to122();
	}

}
