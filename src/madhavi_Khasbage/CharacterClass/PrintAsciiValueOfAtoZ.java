package madhavi_Khasbage.CharacterClass;

/*write a method which will print ascii value of A to Z.*/

public class PrintAsciiValueOfAtoZ {

	void getAsciiValue() {
		char startChar = 'A';
		for (int index = 'A'; index <= 'Z'; index++) {
			System.out.println("\n" + startChar + "'s ascii value is : " + index);
			startChar++;
		}
	}

	public static void main(String[] args) {
		PrintAsciiValueOfAtoZ pntAscii = new PrintAsciiValueOfAtoZ();
		pntAscii.getAsciiValue();
	}
}
