/*Program 3:  write a method which will print ascii value of A to Z.
 */
package aparna.charMethodExamples1;

public class PrintAsciiOfAToZ {

	public void asciiOFAToZ() {
		System.out.println("Ascii value from A to Z is as Follows: ");
		for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
			int asciiValue = ch1;

			System.out.println(asciiValue);
		}
	}

	public static void main(String[] args) {
		PrintAsciiOfAToZ printAsciiOfAToZ = new PrintAsciiOfAToZ();
		printAsciiOfAToZ.asciiOFAToZ();
	}

}
