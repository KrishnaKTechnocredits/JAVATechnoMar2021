package pavan.Assignment_18;

public class PrintAsciiValue {

	void collectAscii() {

		for (int index = 97; index <= 122; index++) {
			char ch = (char) index;
			System.out.println(index + " " + ch);
		}
	}
	public static void main(String[] args) {
		PrintAsciiValue printAsciiValue = new PrintAsciiValue();
		printAsciiValue.collectAscii();
	}
}