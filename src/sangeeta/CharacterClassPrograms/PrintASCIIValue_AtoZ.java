//write a method which will print ascii value of A to Z.

package sangeeta.CharacterClassPrograms;

import java.util.Scanner;

public class PrintASCIIValue_AtoZ {

	void aSCIIValue() {
		for (int index = 65; index >= 65 && index <= 90; index++) {
			char ch = (char) index;
			int temp = index;
			System.out.println(ch + "->" + temp);
		}
	}

	public static void main(String[] a) {
		PrintASCIIValue_AtoZ printASCIIValue_AtoZ = new PrintASCIIValue_AtoZ();
		printASCIIValue_AtoZ.aSCIIValue();
	}

}
