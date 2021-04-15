/*Assignment 18 : 14th April'2021
 * Program 4:  write a program which will print characters between ascii value 97 to 122.
 */

package sourabh.stringExamples;

public class PrintCharactersOfAscii {
	void getCharOfAscii(int startAscii, int endAscii) {
		System.out.println("-------Print characters between ascii value 97 to 122----------");
		for(int index= startAscii; index<=endAscii; index++) {
			System.out.println(index+": "+(char)index);
		}
	}
	public static void main(String[] args) {
		PrintCharactersOfAscii printCharactersOfAscii=new PrintCharactersOfAscii();
		printCharactersOfAscii.getCharOfAscii(97, 122);
	}

}
