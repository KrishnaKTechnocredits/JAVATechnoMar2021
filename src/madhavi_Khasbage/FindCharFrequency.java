package madhavi_Khasbage;

import java.util.Scanner;

/*Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.
Input : technocredits
char : e
output : e -> 2*/

public class FindCharFrequency {

	int charFrequencyCount(String str, char findChar) {		
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == findChar) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		FindCharFrequency charFeq = new FindCharFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string to count character : ");
		String str = scanner.nextLine();
		System.out.print("Enter a character : ");
		char ch = scanner.next().charAt(0);
		System.out.println("Occurrence of character " + ch + " in the string is: " + charFeq.charFrequencyCount(str, ch));
		scanner.close();
	}
}
