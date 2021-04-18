package pallavi.Assignment_18;

public class AsciivalueOfNum {
	void number() {
		for (int index = 97; index <= 122; index++) {
			System.out.println("Ascii value of " + index + " is " + (char) index);
		}
	}

	public static void main(String[] args) {
		new AsciivalueOfNum().number();

	}

}
