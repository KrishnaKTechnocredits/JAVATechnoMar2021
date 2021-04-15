/*Program 3: write a method which will print ascii value of A to Z.*/
package shilpa.Assignment_18;

public class PrintAsciiValFromAtoZ {

	void GetAsciiValuesFromAtoZ() {
		System.out.println("Ascii Values of A-Z");
		for (char index = 'A'; index <= 'Z'; index++) {
			int Asccival = (int) index;
			System.out.println(Asccival);
		}
	}

	public static void main(String[] args) {
		PrintAsciiValFromAtoZ getAsciiValues = new PrintAsciiValFromAtoZ();
		getAsciiValues.GetAsciiValuesFromAtoZ();
	}
}
