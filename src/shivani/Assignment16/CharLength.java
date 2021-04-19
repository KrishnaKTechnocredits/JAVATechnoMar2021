package shivani.Assignment16;

import java.util.Scanner;

/*Find the frequency of character from a given String array.
Note: Take String and character from the user using scanner class.

Input : technocredits
char : e
output : e -> 2*/
public class CharLength {
	static int count = 0;

	void charFrequency(String word, char alpha) {

		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == alpha)
				count++;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the any word");
		String sc1 = sc.next();
		sc1.toUpperCase();
		System.out.println("enter the alphabet");
		String ch1 = sc.next();
		ch1.toUpperCase();
		char alphabet = ch1.charAt(0);
		CharLength charlength = new CharLength();
		charlength.charFrequency(sc1, alphabet);
		System.out.println("frequency of given alphabet is : " + count);
		sc.close();

	}

}
