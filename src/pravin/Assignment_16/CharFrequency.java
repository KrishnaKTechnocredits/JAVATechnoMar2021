/*Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user using scanner class.

Input : pravinppp
char : e
output : e -> 4
*/
	package pravin.Assignment_16;
	
	import java.util.Scanner;
	
	
	public class CharFrequency {
	
		void getCharFrequecy(String character, char charat) {
			int count = 0;
			for (int index = 0; index < character.length(); index++) {
				if (character.charAt(index) == charat)
					count++;
			}
			System.out.println("target character count is => " + count);
		}
	
		public static void main(String[] args) {
			CharFrequency charFrequency = new CharFrequency();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter input:");
			String input = scanner.next();
			System.out.println("Enter target character:");
			char ch = scanner.next().charAt(0);
			scanner.close();
			charFrequency.getCharFrequecy(input, ch);
		}
	}	
