package pavan.Assignment_18;

public class AsciiValuefromAtoZ {

	void asciiValuesofAtoZ() {
		char ch;
		for (ch = 'A'; ch <= 'Z'; ch++) {

			int ascii = (int) ch;
			System.out.println(ch + " " + ascii);
		}
	}
	public static void main(String[] args) {
		AsciiValuefromAtoZ asciiValuefromAtoZ = new AsciiValuefromAtoZ();
		asciiValuefromAtoZ.asciiValuesofAtoZ();

	}
}