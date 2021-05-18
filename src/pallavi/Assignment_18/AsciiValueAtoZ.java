package pallavi.Assignment_18;

public class AsciiValueAtoZ {

	void asciivalueAtoZ() {
		for (int index = 'A'; index <= 'Z'; index++) {
			System.out.println("Ascii value of " + (char) index + " is " + index);
		}

	}

	public static void main(String[] args) {
		new AsciiValueAtoZ().asciivalueAtoZ();

	}

}
