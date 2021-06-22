package gauravk.Assignment_4;
/*#4
 * Program 4:  write a program which will print characters between ascii value 97 to 122.
 */
public class PrintCharactersOfAscii {
	
	void printCharacter() {
		for(int num = 97; num<=122; num++) {
			System.out.println(num+" = "+(char)num);
		}
	}
	
	public static void main(String[] a) {
		PrintCharactersOfAscii printCharactersOfAscii1 = new PrintCharactersOfAscii();
		printCharactersOfAscii1.printCharacter();
	}
}